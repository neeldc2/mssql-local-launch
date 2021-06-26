package com.example.testcasedemo.service.impl;

import com.example.testcasedemo.entity.Person;
import com.example.testcasedemo.repository.PersonRepository;
import com.example.testcasedemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
