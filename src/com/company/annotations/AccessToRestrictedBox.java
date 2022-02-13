package com.company.annotations;

import java.lang.annotation.*;

// мы будем делать обьект какого-то класса и мы будем допускать этот обьект или нет в нашу коробку
@Target(ElementType.TYPE)
// на этапе чего будет допускаться наша комманда
@Retention(RetentionPolicy.RUNTIME)
// inherited - аннотация позволяет добавить всех животных которые расширяются от класса Cat
@Inherited
public @interface AccessToRestrictedBox {
}
