package com.company.doors;

public class MainDoor {

    public static void main(String[] args) {
        //  create name of object  "slidingDoor", SlidingDoor - тип обьекта, create new object - new SlidingDoor,
        //  и создаем ей свойства для конкретного этого обьекта  ("shape", "red")
        SlidingDoor slidingDoor = new SlidingDoor("shape", "red");
        //  так как closeDoor() это void method, то он не может быть в  sout
        slidingDoor.closeDoor();
        //  так как метод getColor() отсутствует у класса SlidingDoor, но мы его может показать, потому что он есть у контракта
        System.out.println(slidingDoor.getColor());

        SlidingDoor slidingDoor1 = new SlidingDoor("shape1", "green");
        System.out.println(slidingDoor1.getColor());

        SuperSlidingDoor doorsuper = new SuperSlidingDoor("shapew", "orange");
        doorsuper.getColor();
        doorsuper.closeDoor();
        doorsuper.openDoor();
        doorsuper.dance();
        // int i  - local variable
        int i = 5;
        doorsuper.dance(i);

    }
}
