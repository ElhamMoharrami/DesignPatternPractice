package com.practice.designPattern.creational.factoryMethod;

public class ToyMakingLine implements Factory {
    @Override
    public Product display() {
        return new Toy("15");
    }
}
