package com.company.doors;

//  abstract - ключевое слово, значит, что все двери должны иметь свойства принаджежащие классу Door
//  class Door является абстрактным, тоесть выделение абстракции над реальными дверьми IDoor и SlidingDoor
public abstract class Door {
    //    shape and color это свойства класса Door
    String shape;
    String color;

    //   конструктор мы генерим
    public Door(String shape, String color) {
        System.out.println("door constructor");
        this.shape = shape;
        this.color = color;
    }
    //  у класса Door есть два метода openDoor() и closeDoor()
    //  ключевое слово  abstract  - обьявляет наши методы контрактом для всех классов других дверей,
    //  это значит, что все двери должны соблюдать этот контракт openDoor() и closeDoor()
    public abstract void openDoor();
    public abstract void closeDoor();
    //  getColor() - не входит в контракт, поэтому необязателен, но по этому методу мы можем получить цвет любой двери
    public String getColor() { return color; }

}
