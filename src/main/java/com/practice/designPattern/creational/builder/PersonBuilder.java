package com.practice.designPattern.creational.builder;

import lombok.Getter;

@Getter
public class PersonBuilder {
    private String firstName;
    private String lastName;
    private String job;
    private String favoriteColor;
    private String motherName;
    private String fatherName;
    private boolean isMarried;
    private boolean hasChildren;
    private int age;

    public PersonBuilder setFirstName(String firstName){
        this.firstName=firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName){
        this.lastName=lastName;
        return this;
    }

    public PersonBuilder setJob(String job){
        this.job=job;
        return this;
    }

    public PersonBuilder setFavoriteColor(String favoriteColor){
        this.favoriteColor=favoriteColor;
        return this;
    }

    public PersonBuilder setMotherName(String motherName){
        this.motherName=motherName;
        return this;
    }

    public PersonBuilder setFatherName(String fatherName){
        this.fatherName=fatherName;
        return this;
    }

    public PersonBuilder setIsMarried(boolean isMarried){
        this.isMarried=isMarried;
        return this;
    }

    public PersonBuilder setHasChildren(boolean hasChildren){
        this.hasChildren=hasChildren;
        return this;
    }

    public PersonBuilder setAge(int age){
        this.age=age;
        return this;
    }

    public Person build(){
        return new Person(this);
    }


}
