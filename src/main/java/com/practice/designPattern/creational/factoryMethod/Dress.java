package com.practice.designPattern.creational.factoryMethod;

public class Dress implements Product {
    private String cost;

    public Dress(String cost) {
        this.cost = cost;
    }

    @Override
    public void showDescription() {
        System.out.println("this is dress description");
    }

    @Override
    public void showPrice() {
        System.out.println("dress price " + cost);
    }
}
