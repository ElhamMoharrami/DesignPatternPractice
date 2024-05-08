package com.practice.designPattern.creational.builder;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = Person.getBuilder().setFirstName("Pearl").setLastName("Mooney").setAge(25).setHasChildren(true).build();
        System.out.println(person1);
    }
}
