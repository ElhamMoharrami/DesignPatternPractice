package com.practice.designPattern.creational.factoryMethod;

public class Toy implements Product {
    private String cost;

    public Toy(String cost) {
        this.cost = cost;
    }

    @Override
    public void showDescription() {
        System.out.println("this is toy description");
    }

    @Override
    public void showPrice() {
        System.out.println("toy price " + cost);
    }
}
