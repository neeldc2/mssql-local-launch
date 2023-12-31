package com.example.testcasedemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.UUID;

@Data
@Entity
@Table(name = "Person", schema = "Dblock")
public class Person {

    @Id
    @JdbcTypeCode(SqlTypes.LONGVARCHAR)
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
