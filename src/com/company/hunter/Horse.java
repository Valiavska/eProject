package com.company.hunter;

public class Horse extends Animal{

    public Horse(String name, int weight, String type) {
        super(name, weight, type);
    }

    @Override
    public void makeSound() {
        System.out.println("Horse make sound: Neigh, Neigh, Neigh");
    }

    @Override
    public void eat() {
        System.out.println("Horse eat: grass");
    }

    @Override
    public void sleep() {
        System.out.println("Horse sleep: 3 hours");
    }

}
