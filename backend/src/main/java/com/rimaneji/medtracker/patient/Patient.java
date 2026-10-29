package com.rimaneji.medtracker.patient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String ward;
    private String bed;
    private Instant createdAt;

    // JPA needs an empty constructor to create objects when loading from the database
    protected Patient() {
    }

    public Patient(String firstName, String lastName, LocalDate dateOfBirth, String ward, String bed) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.ward = ward;
        this.bed = bed;
        this.createdAt = Instant.now();
    }

    public Long getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public String getWard() { return ward; }
    public String getBed() { return bed; }
    public Instant getCreatedAt() { return createdAt; }
}