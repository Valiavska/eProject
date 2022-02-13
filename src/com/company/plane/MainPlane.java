package com.company.plane;

public class MainPlane {
    // create object "plane"
    public static void main(String[] args) {
        //  у нового обьекта "new Plane" есть свойства  (9, 87, 8, "plane", "engine1", "boing747")
        //  два одинаковых новых обьекта "new Plane" с разными названиями (plane and plane1) не могут быть равны,
        //  потому что занимают два разных места в памяти
        Plane plane = new Plane(9, 87, 8, "plane", "engine1", "boing747");
        Plane plane1 = new Plane(9, 87, 8, "plane", "engine1", "boing747");
        plane.move(777);
        // получить название обькта
        plane.getName();
        System.out.println("plane: " + plane);
        System.out.println("plane: " + plane1);
        System.out.println("Get Plane name: " + plane.getName());
        System.out.println("Plane is equal to Plane1:" + plane.equals(plane1));
        System.out.println("Plane is equal to Plane1:" + plane.hashCode());
        System.out.println("Plane1 is equal to Plane1:" + plane1.hashCode());
        //  сравниваем свойства двух обьектов "plane" и "plane1"
        System.out.println("Equals?: :" + plane.equals(plane1));
        // изменить значение выбранному свойству
        plane.setId(8);
        System.out.println("Plane objects: " + plane);
    }
}
