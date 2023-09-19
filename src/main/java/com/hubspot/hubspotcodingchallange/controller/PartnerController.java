package com.hubspot.hubspotcodingchallange.controller;

import com.hubspot.hubspotcodingchallange.model.Invitation;
import com.hubspot.hubspotcodingchallange.model.InvitationRequest;
import com.hubspot.hubspotcodingchallange.service.PartnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class PartnerController {
    private final PartnerService partnerService;

    @GetMapping(value = "partners", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Invitation>> getPartners() {
        var invitations = partnerService.getPartners();

        partnerService.sendInvitation(new InvitationRequest(invitations));
        return new ResponseEntity<>(invitations, HttpStatus.OK);
    }

}
