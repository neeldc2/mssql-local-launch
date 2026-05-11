package com.example.testcasedemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.UUID;

@Data
@Builder
@Entity
@Table(name = "Person", schema = "Dblock")
@NoArgsConstructor
@AllArgsConstructor
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
