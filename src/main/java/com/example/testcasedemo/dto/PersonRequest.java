package com.example.testcasedemo.dto;

import lombok.Data;

@Data
public class PersonRequest {
    private int personId;
    private String firstName;
    private String lastName;
}
