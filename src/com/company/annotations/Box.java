package com.company.annotations;

import java.util.ArrayList;
import java.util.List;

public abstract class Box {
     //   абстрактный класс "Box" хранит в себе переменную  "values"
     //   в которую можно положить что угодно, так как это список List
    protected List<Object> values = new ArrayList<>();

    //  у этого класса  "Box" есть один метод, что-то добавить в коробку, принимает все обьекты (Object value)
    protected void addToBox(Object value) {
        //  в коробку будем добавлять все что к нам пришло
        this.values.add(value);
    }
}
