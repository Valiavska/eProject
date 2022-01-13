package com.company.doors;

public class MainDoor {

    public static void main(String[] args) {

        SlidingDoor slidingDoor = new SlidingDoor("shape", "red");
        //  так как closeDoor() это void method, то он не может быть в  sout
        slidingDoor.closeDoor();
        //  так как метод getColor() отсутствует у класса SlidingDoor, но мы его может показать, потому что он есть у контракта
        System.out.println(slidingDoor.getColor());
    }
}
