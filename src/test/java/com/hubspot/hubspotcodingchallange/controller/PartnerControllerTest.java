package com.hubspot.hubspotcodingchallange.controller;

import com.hubspot.hubspotcodingchallange.service.PartnerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PartnerController.class)
public class PartnerControllerTest {
private static final String GET_PARTNERS_ENDPOINT_URL = "/api/v1/partners";

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PartnerService partnerService;

    @Test
    public void getPartnersSuccess_shouldReturn200WithListOfPartners() throws Exception {
        var result = mockMvc.perform(get(GET_PARTNERS_ENDPOINT_URL));

        result.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JSON));
    }
}
