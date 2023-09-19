package com.hubspot.hubspotcodingchallange.service;

import com.hubspot.hubspotcodingchallange.client.HttpPartnerClient;
import com.hubspot.hubspotcodingchallange.model.Invitation;
import com.hubspot.hubspotcodingchallange.model.InvitationRequest;
import com.hubspot.hubspotcodingchallange.model.Partner;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import static java.time.LocalDate.parse;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

@Service
@RequiredArgsConstructor
public class PartnerService {
    private final HttpPartnerClient partnerClient;

    public List<Invitation> getPartners() {
        var partners = partnerClient.getPartners();
        var filteredAvailablePartners = checkPartnerAvailability(partners);
        var countryPartnersMap = mapPartnerToCountry(filteredAvailablePartners);
        List<Invitation> invitations = generateAttendeeList(countryPartnersMap);
        return invitations;
    }

    public void sendInvitation(InvitationRequest request) {
        partnerClient.sendInvitations(request);
    }

    private List<Partner> checkPartnerAvailability(List<Partner> partners) {
        return partners.stream()
                .map(partner -> {
                    partner.setAvailableDates(findConsecutiveDates(partner.getAvailableDates()));
                    return partner;
                })
                .toList();
    }

    private List<String> findConsecutiveDates(List<String> availableDates) {
        return availableDates.stream()
                .filter(
                        date -> availableDates.contains(parse(date).plusDays(1L).toString())
                )
                .toList();
    }

    private Map<String, List<Partner>> mapPartnerToCountry(List<Partner> partners) {
        return partners.stream()
                .sorted(comparing(Partner::getCountry))
                .collect(groupingBy(person -> person.getCountry(),
                        HashMap::new, Collectors.toCollection(ArrayList::new)));
    }

    private List<Invitation> generateAttendeeList(Map<String, List<Partner>> countryPartnersMap) {
        List<Invitation> invitations = new ArrayList<>();

        countryPartnersMap.forEach((date, partners) -> {
            var bestStart = findBestDateForCountry(partners);
            var invitation = new Invitation();
            invitation.setAttendeeCount(
                    partners.stream()
                            .filter(partner -> partner.getAvailableDates().contains(bestStart))
                            .toList()
                            .size()
            );
            invitation.setName(date);
            invitation.setAttendees(
                    partners.stream()
                            .filter(partner -> partner.getAvailableDates().contains(bestStart))
                            .sorted(comparing(Partner::getEmail))
                            .map(Partner::getEmail)
                            .collect(toList())
            );
            invitation.setStartDate(bestStart);
            invitations.add(invitation);
        });

        return invitations;

    }

    private String findBestDateForCountry(List<Partner> partners) {
        if(partners.stream().noneMatch(partner -> partner.getAvailableDates().size() > 0)) {
            return null;
        }
        return partners.stream()
                .map(Partner::getAvailableDates)
                .flatMap(Collection::stream)
                .collect(groupingBy(date -> date, counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();
    }
}
