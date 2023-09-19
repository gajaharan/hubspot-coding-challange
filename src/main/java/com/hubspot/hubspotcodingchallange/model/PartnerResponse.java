package com.hubspot.hubspotcodingchallange.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartnerResponse {
    private List<Partner> partners;
}
