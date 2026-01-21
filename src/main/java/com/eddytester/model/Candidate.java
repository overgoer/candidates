package com.eddytester.model;

import java.time.Year;

public class Candidate {
    private String name;
    private Year birthYear;
    private Integer age;
    private String status;
    public Candidate(String name, Year birthYear){
        this.name = name;
        this.birthYear = birthYear;
        this.age = Year.now().getValue() - birthYear.getValue();
        this.status = defineCandidateStatus(this.age);
    }

    private String defineCandidateStatus(Integer age){
        if(age < 18){
            return "minor";
        } else if(age < 65){
            return "candidate";
        } else return "retired";
    }
    public Year getBirthYear() {
        return birthYear;
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
