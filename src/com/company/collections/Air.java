package com.company.collections;

//  <Air> - типизировали интерфейс Comparable
public class Air implements Comparable<Air>{
    private int id;
    private int capacity;
    private int wings;
    private String name;
    private String engine;
    private String type;

    public Air(int id, int capacity, int wings, String name, String engine, String type) {
        this.id = id;
        this.capacity = capacity;
        this.wings = wings;
        this.name = name;
        this.engine = engine;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Air{" +
                "id=" + id +
                ", capacity=" + capacity +
                ", wings=" + wings +
                ", name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Air air = (Air) o;

        if (id != air.id) return false;
        if (capacity != air.capacity) return false;
        if (wings != air.wings) return false;
        if (!name.equals(air.name)) return false;
        if (!engine.equals(air.engine)) return false;
        return type.equals(air.type);
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


//    compareTo(Air o)  - будем сравнивать сами с собой
    @Override
    public int compareTo(Air o) {
        //  this.id - o.id - хотим сортировать только по id
        return this.id - o.id;
    }

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
}
