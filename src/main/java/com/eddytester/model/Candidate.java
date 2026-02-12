package com.eddytester.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class Candidate {
    private final String name;
    private final String birthDate;
    private final Integer age;
    private final String status;
    public Candidate(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
        this.age = Period.between(LocalDate.parse(this.birthDate), LocalDate.now()).getYears();
        this.status = defineCandidateStatus(this.age);
    }

    private String defineCandidateStatus(Integer age){
        if(age < 18){
            return CandidateStatus.MINOR.statusValue;
        } else if(age < 65){
            return CandidateStatus.CANDIDATE.statusValue;
        } else return CandidateStatus.RETIRED.statusValue;
    }
    public String getBirthDate() {
        return birthDate;
    }

    public String getName(){
        return name;
    }

    public String getStatus(){
        return status;
    }

    public Integer getAge(){
        return age;
    }

}
