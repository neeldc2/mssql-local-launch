package com.example.testcasedemo.service.impl;

import com.example.testcasedemo.entity.Person;
import com.example.testcasedemo.repository.PersonRepository;
import com.example.testcasedemo.service.PersonService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }
}
