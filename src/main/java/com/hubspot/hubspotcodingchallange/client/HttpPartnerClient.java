package com.hubspot.hubspotcodingchallange.client;

import com.hubspot.hubspotcodingchallange.model.InvitationRequest;
import com.hubspot.hubspotcodingchallange.model.Partner;
import com.hubspot.hubspotcodingchallange.model.PartnerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@RequiredArgsConstructor
public class HttpPartnerClient {
    @Value( "${hubspot.invitations.fetch.partners.url}" )
    private String fetchPartnerUri;

    @Value( "${hubspot.invitations.send.partners.url}" )
    private String sendInvitationsUri;

    private final RestTemplate restTemplate;

    public List<Partner> getPartners() {
        return restTemplate.getForObject(fetchPartnerUri, PartnerResponse.class).getPartners();
    }

    public ResponseEntity sendInvitations(InvitationRequest request) {
        return restTemplate.postForObject(sendInvitationsUri, request, ResponseEntity.class);
    }
}
