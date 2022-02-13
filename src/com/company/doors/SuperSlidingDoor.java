package com.company.doors;

// наследование
public class SuperSlidingDoor extends SlidingDoor{

    public SuperSlidingDoor(String shape, String color) {
        super(shape, color);
    }

    @Override
    public void openDoor() {
        System.out.println("I am super I want to open in other way");
    }

    public void dance() {
        System.out.println("dancing door");
    }
    // можно создаем два и больше метода с одинаковыми названиями, но с разными параметрами - называется "перегрузка методов"
    public void dance(int i) {
        System.out.println("dancing door with param");
    }

}
