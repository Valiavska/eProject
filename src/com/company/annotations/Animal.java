package com.company.annotations;

public abstract class Animal {
    String name;
    int weight;
    String type;

    public Animal(String name, int weight, String type) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (weight != animal.weight) return false;
        if (!name.equals(animal.name)) return false;
        return type.equals(animal.type);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + weight;
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}