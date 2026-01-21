package com.eddytester.model;

import java.time.Year;

public class CandidateDto {
    private Long id;
    private String name;
    private Year birthDate;
    private Integer age;
    private String status;

    public CandidateDto(Long id, Candidate candidate){
        this.id = id;
        this.age = candidate.getAge();
        this.birthDate = candidate.getBirthYear();
        this.name = candidate.getName();
        this.status = candidate.getStatus();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Year getBirthYear() {
        return birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public String getStatus() {
        return status;
    }
}
