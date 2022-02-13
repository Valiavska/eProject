package com.company.doors;

// "implements" - ключевое слово, чтобы реализовать "interface"
// class implements 2 contracts (IDoor, IOpen)
// Если нужно несколько контрактов использовать, то используем "interface" конструкцию
public class SlidingDoorInterface implements IDoor, IOpen{
    //    реализовуем обязательные методы "interface" конструкции, типа контракта
    @Override
    public void openDoor() {

    }

    @Override
    public void closeDoor() {

    }

    @Override
    public void openFast() {

    }
}
