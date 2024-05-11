package com.practice.designPattern.creational.factoryMethod;

public class FactoryMethodMain {
    public static void main(String[] args) {
        Factory factoryA=new DressMakingLine();
        Product productA=factoryA.display();
        productA.showDescription();
        productA.showDescription();

        Factory factoryB=new ToyMakingLine();
        Product productB=factoryB.display();
        productB.showDescription();
        productB.showPrice();
    }
}
