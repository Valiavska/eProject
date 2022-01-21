package com.company.hunter;

public class MainAnimal {

    public static void main(String[] args){
        Cat cat = new Cat("Cat - Vasya", 4, "pet");
        Cat cat1 = new Cat("Cat - Vasya", 4, "pet");
        Tiger tiger = new Tiger("Tiger - Tosha", 90, "wild");
        Horse horse = new Horse("Horse - Lola", 450, "wild");
        Pig pig = new Pig("Pig - pushka", 250, "pet");

        cat.getName();
        cat.getWeight();
        cat.makeSound();
        System.out.println("Get Cat name: " + cat.getName());
        System.out.println("Get Cat weight: " + cat.getWeight());
        System.out.println("get Cat: " + cat);
        System.out.println("get Cat1: " + cat1);
        System.out.println("____________________________________________");

        tiger.getName();
        tiger.getWeight();
        tiger.getType();
        tiger.eat();
        tiger.makeSound();
        System.out.println("Get Tiger name: " + tiger.getName());
        System.out.println("Get Tiger weight: " + tiger.getWeight());
        System.out.println("Get Tiger type: " + tiger.getType());
        System.out.println("get Cat: " + tiger);
        System.out.println("____________________________________________");

        horse.getType();
        horse.getWeight();
        horse.getName();
        horse.makeSound();
        horse.eat();
        horse.sleep();
        System.out.println("Get Horse type: " + horse.getType());
        System.out.println("Get Horse weight: " + horse.getWeight());
        System.out.println("Get Horse name: " + horse.getName());
        System.out.println("get Cat: " + horse);
        System.out.println("____________________________________________");

        pig.sleep();
        pig.makeSound();
        pig.eat();
        pig.getName();
        pig.getWeight();
        pig.getType();
        System.out.println("Get Pig name: " + pig.getName());
        System.out.println("Get Pig weight: " + pig.getWeight());
        System.out.println("Get Pig type: " + pig.getType());
        System.out.println("get Cat: " + pig);
        System.out.println("____________________________________________");

        System.out.println("Cat is equal to Cat1?  " + cat.equals(cat1));
        System.out.println("Show hascode Cat? " + cat.hashCode());
        System.out.println("Show hascode Cat1? " + cat1.hashCode());
        System.out.println("Equals?  " + cat.equals(cat1));
    }
}
