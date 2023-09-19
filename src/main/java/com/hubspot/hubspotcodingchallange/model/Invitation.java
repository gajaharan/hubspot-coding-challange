package com.hubspot.hubspotcodingchallange.model;

import lombok.Data;

import java.util.List;

@Data
public class Invitation {
    private int attendeeCount;
    private List<String> attendees;
    private String name;
    private String startDate;
}
