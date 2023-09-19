package com.hubspot.hubspotcodingchallange.integration;

import com.hubspot.hubspotcodingchallange.model.Invitation;
import com.hubspot.hubspotcodingchallange.model.Partner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PartnerIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    int randomServerPort;

    @Test
    public void shouldReturn200_whenGetPartnersIsCalledWithAListOfPartners() {
        var baseUrl = "http://localhost:" + randomServerPort + "/api/v1/partners";
        var responseType = new ParameterizedTypeReference<List<Invitation>>() {};
        final var response = restTemplate.exchange(baseUrl, HttpMethod.GET, null, responseType);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        var invitations = response.getBody();
        assertEquals(9, invitations.size());
    }
}
