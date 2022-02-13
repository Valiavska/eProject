package com.company.generics;

// GenericClass <T> - указан его тип, потом будем подставлять реальный тип
// extends Number - этим мы, ограничили наш обобщенный класс, теперь он работает только с "Number"
public class GenericClass<T extends Number> {
     //  свойство - "ob"
    T ob;

    //  конструктор
    GenericClass(T o) {ob = o; }

    T getObject() { return ob; }

    //   метод - показать тип
    void showType() {
        //   выводит тип, который получил обьект созданный этим классом,
        //   ob.getClass().getName()  - рефлексия, возможность получать из обьектов данные о его классах и тд
        System.out.println("Type T: " + ob.getClass().getName());
    }
}
