package com.company.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// аннотация чтобы задавать размер коробки, чтобы в рантайме я могла помещать что-то в коробку
// и если места больше нет, то выдавать сообщение
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface BoxSize {
    //  аннотация будет отвечать за размер
    int size();
}
