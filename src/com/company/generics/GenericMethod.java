package com.company.generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenericMethod {

    //  метод конвертирует с массива в список
    //   "T[] a" - тип, массив и его индитификатор "a"
    //   "extends String"  - ограничили наш метод, значит, что он будет работать только со строками
    public <T extends String> List<T> fromArrayToList(T[] a) { return Arrays.stream(a).collect(Collectors.toList());}
}
