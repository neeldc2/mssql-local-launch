package com.example.testcasedemo.controller;

import com.example.testcasedemo.dto.PersonRequest;
import com.example.testcasedemo.dto.PersonResponse;
import com.example.testcasedemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public List<PersonResponse> getAllPerson() {
        return personService.getAllPerson();
    }

    @PostMapping("/persons")
    public void savePerson(@RequestBody PersonRequest personRequest) {
        personService.savePerson(personRequest);
    }
}

