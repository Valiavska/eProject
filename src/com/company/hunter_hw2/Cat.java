package com.company.hunter;

public class Cat extends Animal{


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

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (weight != cat.weight) return false;
        if (!name.equals(cat.name)) return false;
        return type.equals(cat.type);
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + name.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

}
