package com.company.doors;

// extends - значит, что дверь SlidingDoor должна иметь все свойства двери Door, тоесть следовать контракту
// Если нужно использовать один контракт, то используем abstract
public class SlidingDoor extends Door {

    //   конструктор  мы генерим public SlidingDoor
    public SlidingDoor(String shape, String color) {
        // super - говорит нам, что мы вызываем конструктор по контракту
        super(shape, color);
        System.out.println("in sliding door");

    }

    @Override
    public void openDoor() {
        System.out.println("opening the SlidingDoor");

    }

    @Override
    public void closeDoor() {
        System.out.println("closing the SlidingDoor");

    }
}
