package com.practice.designPattern.creational.factoryMethod;

public class DressMakingLine implements Factory {
    @Override
    public Product display() {
        return new Dress("10");
    }
}
