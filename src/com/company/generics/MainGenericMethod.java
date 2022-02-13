package com.company.generics;

import java.util.List;

public class MainGenericMethod {

    public static void main(String[] args) {

        Integer [] integers = {1,2,3};
        String [] strings = {"one", "two", "three"};
        //  создадим сущность метода
        GenericMethod genericMethod = new GenericMethod();
        //  вызовем его, для начала положим его в переменную типа Integer
        //   "extends String"  - ограничили наш метод, значит, что он будет работать только со строками
//        List<Integer> integerListFromArray = genericMethod.fromArrayToList(integers);
//        System.out.println(integerListFromArray);

        List<String> stringListFromArray = genericMethod.fromArrayToList(strings);
        System.out.println(stringListFromArray);

    }
}
