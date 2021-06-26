package com.example.testcasedemo.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "Person", schema = "Dblock")
public class Person {
    @Id
    @Type(type = "uuid-char")
    private UUID id;

    @Column(name = "personId")
    private int personId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Version
    @Column(name = "version")
    private int version;
}
