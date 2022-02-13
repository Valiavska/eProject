package com.company.doors;

// выделяем тоже типо абстрактное поведение будующих обьектов
public interface IDoor {
    // этот "interface" по контракту должен делать (openDoor(), closeDoor())
    void openDoor();
    void closeDoor();
    //    "interface" тоже может имплементировать метод по умолчанию, добавляем ключевое слово "default"
    default void dance() {
        System.out.println("interface Door");
    }
}
