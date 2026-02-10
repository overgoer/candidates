package com.eddytester.model;

import java.time.LocalDate;
import java.time.Year;

public class CandidateDto {
    private final Long id;
    private final String name;
    private final String birthDate;
    private final Integer age;
    private final String status;

    public CandidateDto(Long id, Candidate candidate){
        this.id = id;
        this.age = candidate.getAge();
        this.birthDate = candidate.getBirthDate();
        this.name = candidate.getName();
        this.status = candidate.getStatus();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public String getStatus() {
        return status;
    }
}
