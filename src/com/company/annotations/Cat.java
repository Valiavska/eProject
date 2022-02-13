package com.company.annotations;

//   аннотация @AccessToRestrictedBox
@AccessToRestrictedBox
public class Cat extends Animal {


    public Cat(String name, int weight, String type) {
        super(name, weight, type);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat make sound: Meow, Meow, Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat: mostly meat");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleep: 15 hours");
    }

}
