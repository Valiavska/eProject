package com.company.collections;

public class AirComparator {

    private int id;
    private int capacity;
    private int wings;
    private String name;
    private String engine;
    private String type;

    public AirComparator(int id, int capacity, int wings, String name, String engine, String type) {
        this.id = id;
        this.capacity = capacity;
        this.wings = wings;
        this.name = name;
        this.engine = engine;
        this.type = type;
    }

    @Override
    public String toString() {
        return "AirComparator{" +
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

        AirComparator that = (AirComparator) o;

        if (id != that.id) return false;
        if (capacity != that.capacity) return false;
        if (wings != that.wings) return false;
        if (!name.equals(that.name)) return false;
        if (!engine.equals(that.engine)) return false;
        return type.equals(that.type);
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
