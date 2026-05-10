package com.example.testcasedemo.service;

import com.example.testcasedemo.dto.PersonRequest;
import com.example.testcasedemo.dto.PersonResponse;

import java.util.List;

public interface PersonService {
    List<PersonResponse> getAllPerson();
    void savePerson(PersonRequest personRequest);
}
