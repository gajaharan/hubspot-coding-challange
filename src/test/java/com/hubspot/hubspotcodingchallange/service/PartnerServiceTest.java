package com.hubspot.hubspotcodingchallange.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.hubspot.hubspotcodingchallange.client.HttpPartnerClient;
import com.hubspot.hubspotcodingchallange.model.Invitation;
import com.hubspot.hubspotcodingchallange.model.Partner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static com.hubspot.hubspotcodingchallange.TestFixture.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartnerServiceTest {
    private PartnerService partnerService;
    private HttpPartnerClient mockHttpPartnerClient;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        mockHttpPartnerClient = Mockito.mock(HttpPartnerClient.class);
        this.partnerService = new PartnerService(mockHttpPartnerClient);
        objectMapper = JsonMapper
                .builder()
                .build();
    }

    @Test
    public void getPartersSuccess_shouldReturn200withListOfInvitations() throws JsonProcessingException {
        List<Partner> partners = objectMapper
                .readValue(GET_PARTNER_LIST, new TypeReference<>() {});
        List<Invitation> expected = objectMapper
                .readValue(SEND_INVITATION_LIST, new TypeReference<>() {});
        Mockito.when(mockHttpPartnerClient.getPartners()).thenReturn(partners);
        var actual = partnerService.getPartners();
        assertEquals(expected.size(), actual.size());
        assertEquals(expected, actual);
    }
}
