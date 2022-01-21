package com.company.hunter;

public abstract class Animal {
    String name;
    int weight;
    String type;

    public Animal(String name, int weight, String type) {
        System.out.println("Animal constructor!");
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    public abstract void makeSound();
    public abstract void eat();
    public abstract void sleep();

    public String getName() {
        return name;
    }

    public String getType(){
        return type;
    }

    public int getWeight() {
        return weight;
    }
}