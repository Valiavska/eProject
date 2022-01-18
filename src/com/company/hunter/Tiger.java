package com.company.hunter;

public class Tiger extends Animal{

    public Tiger(String name, int weight, String type) {
        super(name, weight, type);
    }

    @Override
    public void makeSound() {
        System.out.println("Tiger make sound: Growl, Growl, Growl");
    }

    @Override
    public void eat() {
        System.out.println("Tiger eat: Meat");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleep: 18 hours");
    }

}
