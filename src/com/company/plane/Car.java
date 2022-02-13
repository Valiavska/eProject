package com.company.plane;

// Принцип композиции / агрегации
class Engine {

    int power;
    public Engine(int p)
    {

        power = p;
    }
}

// Принцип композиции
//public class Car{
//    String model = "Porshe";
//    Engine engine;
//    //    создаем конструктор Car и в конструкторе создаем двигатель
//    public Car()
//    {
//        this.engine = new Engine(360);
//    }
//}

// Принцип агрегации
public class Car{
    String model = "Porshe";
    Engine engine;
    //   обьект класса Engine - создался отдельно
    //   в конструктор Car мы передаем параметры двигателя
    public Car(Engine engine)
    {

        this.engine = engine;
    }
}