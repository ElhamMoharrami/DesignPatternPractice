package com.practice.designPattern.creational.builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Person {
    private final String firstName;
    private final String lastName;
    private final String job;
    private final String favoriteColor;
    private final String motherName;
    private final String fatherName;
    private final boolean isMarried;
    private final boolean hasChildren;
    private final int age;

     Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.getFirstName();
        this.lastName = personBuilder.getLastName();
        this.job = personBuilder.getJob();
        this.favoriteColor = personBuilder.getFavoriteColor();
        this.motherName = personBuilder.getMotherName();
        this.fatherName = personBuilder.getFatherName();
        this.isMarried = personBuilder.isMarried();
        this.hasChildren = personBuilder.isHasChildren();
        this.age = personBuilder.getAge();
    }


    public static PersonBuilder getBuilder() {
        return new PersonBuilder();
    }
}
