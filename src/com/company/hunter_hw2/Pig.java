package com.company.hunter_hw2;

public class Pig extends Animal{


    public Pig(String name, int weight, String type) {
        super(name, weight, type);
    }

    @Override
    public void makeSound() {
        System.out.println("Pig make sound: Oink, Oink, Oink");
    }

    @Override
    public void eat() {
        System.out.println("Pig eat: plants");
    }

    @Override
    public void sleep() {
        System.out.println("Pig sleep: 7 hours");
    }

}
