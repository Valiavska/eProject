package com.company.annotations;

import java.lang.annotation.Annotation;

public class RestrictedBox extends Box {

    //   переопределили метод абстрактного класса "Box"
    @Override
    protected void addToBox(Object value) {
        // определяем что мы будем добавлять в коробку, на помощь приходит рефлексия
        Class<?> valueClass = value.getClass();

        boolean isAccessible = false;

         //  получим все аннотации которые присутствуют,
        //  создаем переменную "annotation" и итерируемся по всем аннотациям  "valueClass.getAnnotations()"
        for  (Annotation annotation: valueClass.getAnnotations()) {
             //   будем проверять если аннотация является "instanceof" нашей аннотацией "AccessToRestrictedBox"
            if (annotation instanceof AccessToRestrictedBox) {
                //  то переменная isAccessible = true и обьект идет в коробку
                isAccessible = true;
            } else {
                isAccessible = false;
            }
        }
        //  если isAccessible = true
        if (isAccessible) {
            //  вызываем этот метод
            super.addToBox(value);
        } else {
            System.out.println("Access denied! ");
        }
    }
}
