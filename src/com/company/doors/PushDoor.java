package com.company.doors;

public class PushDoor extends Door{
    private String size;
    public PushDoor(String shape, String color, String size) {
        super(shape, color);
        this.size = size;
    }

    @Override
    public void openDoor() {
        System.out.println("Method openDoor from PushDoor class! ");
    }

    @Override
    public void closeDoor() {

    }


    @Override
    public String toString() {
        return "PushDoor{" +
                "size='" + size + '\'' +
                '}';
    }
}
