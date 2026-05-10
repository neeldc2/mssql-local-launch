package com.example.testcasedemo.service.impl;

import com.example.testcasedemo.dto.PersonRequest;
import com.example.testcasedemo.dto.PersonResponse;
import com.example.testcasedemo.entity.Person;
import com.example.testcasedemo.repository.PersonRepository;
import com.example.testcasedemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional(isolation= Isolation.READ_COMMITTED)
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<PersonResponse> getAllPerson() {
        final List<Person> persons = personRepository.findAll();
        return persons.stream()
                .map(person -> PersonResponse.builder()
                        .id(person.getId())
                        .personId(person.getPersonId())
                        .firstName(person.getFirstName())
                        .lastName(person.getLastName())
                        .version(person.getVersion())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public void savePerson(final PersonRequest personRequest) {
        final Person person = Person.builder()
                .id(UUID.randomUUID())
                .personId(personRequest.getPersonId())
                .firstName(personRequest.getFirstName())
                .lastName(personRequest.getLastName())
                .build();
        personRepository.save(person);
    }
}
