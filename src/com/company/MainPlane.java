package com.company;

public class MainPlane {
    // create object "plane"
    public static void main(String[] args) {
        //  у обьекта "plane" есть свойства  (9, 87, 8, "plane", "engine1", "boing747")
        //  два одинаковых обьекта (plane and plane1) не могут быть равны, потому что занимают два разных места в памяти
        Plane plane = new Plane(9, 87, 8, "plane", "engine1", "boing747");
        Plane plane1 = new Plane(9, 87, 8, "plane", "engine1", "boing747");
        plane.move(777);
        // получить название обькта
        plane.getName();
        System.out.println("Get Plane name: " + plane.getName());
        System.out.println("Plane is equil to Plane1:" + plane.equals(plane1));
        System.out.println("Plane is equil to Plane1:" + plane.hashCode());
        System.out.println("Plane1 is equil to Plane1:" + plane1.hashCode());
        //  сравниваем свойства двух обьектов "plane" и "plane1"
        System.out.println("Equals?: :" + plane.equals(plane1));
        // изменить значение выбранному свойству
        plane.setId(8);
        System.out.println("Plane objects: " + plane);
    }
}
