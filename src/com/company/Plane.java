package com.company;

public class Plane {
    //  список свойств класса Plane
    private int id;
    private int capacity;
    private int wings;
    private String name;
    private String engine;
    private String type;

    //    private and public -> это модификаторы доступа, область видимости
    //  generate constructor for Plane using all fields
    public Plane(int id, int capacity, int wings, String name, String engine, String type) {
        this.id = id;
        this.capacity = capacity;
        this.wings = wings;
        this.name = name;
        this.engine = engine;
        this.type = type;
    }

    // create new method - move(), method "move" has parameter -> "distanceKm"
    public void move(int distanceKm) {
        System.out.println("I am moving" + distanceKm);
    }

    // generate method toString() for our object "plane" // @Override -> перекрываем метод родителя Object
    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", capacity=" + capacity +
                ", wings=" + wings +
                ", name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    // метод "set" помогает изменить значение выбранного нами свойству
    public void setId(int id) {
        this.id = id;
    }
    // this - означает, что свойству capacity нужно присвоить значение, которое приходит из мира (int capacity)
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setType(String type) {
        this.type = type;
    }

    // метод "get" помогает получить доступ к нужному свойству
    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWings() {
        return wings;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public String getType() {
        return type;
    }

// метод equals() и hashCode() помогает сравнить свойства двух обьектов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plane plane = (Plane) o;

        if (id != plane.id) return false;
        if (capacity != plane.capacity) return false;
        if (wings != plane.wings) return false;
        if (!name.equals(plane.name)) return false;
        if (!engine.equals(plane.engine)) return false;
        return type.equals(plane.type);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + capacity;
        result = 31 * result + wings;
        result = 31 * result + name.hashCode();
        result = 31 * result + engine.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }
}
