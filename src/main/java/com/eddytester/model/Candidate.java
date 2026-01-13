package com.eddytester.model;

public class Candidate {
    Long id;
    String name;
    Integer age;
    String status;

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName(){
        return name;
    }

    public String getStatus(){
        return status;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
}
