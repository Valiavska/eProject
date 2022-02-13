package com.company.generics;

public class MainGenericClass {

    public static void main(String[] args) {

        //   create genericClass
        //   <Integer>    - с большой буквы, значит, что калсс принимает обьекты
        GenericClass<Integer> genericClass = new GenericClass<>(Integer.valueOf(9));
         //    call his method
        genericClass.showType();


        GenericClass<Short> genericShortClass = new GenericClass<>(Short.parseShort("4"));
        genericShortClass.showType();


          //   не может работать с "String" - так как мы указали, что
          //   GenericClass расширяется  от Number
//        GenericClass<String> genericStringClass = new GenericClass<>("genericStringClass");
//        genericStringClass.showType();

    }
}
