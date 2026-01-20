package com.eddytester.model;

public class CandidateDto {
    Long id;
    String name;
    Integer birthDate;
    Integer age;
    String status;

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

    public Integer getBirthDate() {
        return birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public String getStatus() {
        return status;
    }
}
