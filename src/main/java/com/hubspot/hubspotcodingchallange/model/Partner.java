package com.hubspot.hubspotcodingchallange.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Partner {
    private String firstName;
    private String lastName;
    private String email;
    private String country;
    private List<String> availableDates;
}
