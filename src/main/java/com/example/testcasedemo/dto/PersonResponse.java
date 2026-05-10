package com.example.testcasedemo.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class PersonResponse {
    private UUID id;
    private int personId;
    private String firstName;
    private String lastName;
    private int version;

    public PersonResponse(UUID id, int personId, String firstName, String lastName, int version) {
        this.id = id;
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.version = version;
    }
}
