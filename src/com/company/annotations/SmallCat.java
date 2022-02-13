package com.company.annotations;

// создадим подкласс, который расширяет котов
public class SmallCat extends Cat {

    public SmallCat(String name, int weight, String type) {
        super(name, weight, type);
    }

    @Override
    public void eat() {
        System.out.println("Cat eat milk! ");
    }


}
