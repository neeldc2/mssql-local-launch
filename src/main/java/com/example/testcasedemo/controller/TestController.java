package com.example.testcasedemo.controller;

import com.example.testcasedemo.entity.Person;
import com.example.testcasedemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public List<Person> getAllPerson() {
        return personService.getAllPerson();
    }
}
