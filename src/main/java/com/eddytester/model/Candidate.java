package com.eddytester.model;

import java.time.Year;

public class Candidate {
    private String name;
    private Integer birthYear;
    private Integer age;
    private String status;
    public Candidate(String name, Integer birthYear){
        this.name = name;
        this.birthYear = birthYear;
        this.age = Year.now().getValue() - birthYear;
        this.status = defineCandidateStatus(this.age);
    }

    private String defineCandidateStatus(Integer age){
        if(age < 18){
            return "minor";
        } else if(age < 65){
            return "candidate";
        } else return "retired";
    }
    public Integer getBirthYear() {
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
