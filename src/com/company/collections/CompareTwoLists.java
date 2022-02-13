package com.company.collections;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareTwoLists {
    //  static  - применяется к переменной и к методу , значит, что
    //  все операции принадлежат классу CompareTwoLists
    public static void compare2Lists() {
        //   create two empty lists:   arrayList,  linkedList
        List<Double> arrayList = new ArrayList<>();
        List<Double> linkedList = new LinkedList<>();

        //   задаем большой размер элементов
        final int listSize = 1000000;

        //   заполняем элементами  arrayList,  linkedList
        for (int i = 0; i < listSize; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }

        //   фиксируем время до начала запроса
        long startTime = System.currentTimeMillis();

//        SimpleDateFormat dataTimeFormatter = new SimpleDateFormat("hh:mm:ss");
//        Date date = new Date(startTime);
//        System.out.println("Start time is: " + dataTimeFormatter.format(data));

        //   из массива listSize делаем выборку 1000 элементов
        final int numberOfElementsToGet = 1000;


        for (int i = 0; i < numberOfElementsToGet; i++) {
            //  (Math.random() * (listSize - 1)) - закладываем индекс, чтоб не вылезти за границу
            arrayList.get((int) (Math.random() * (listSize - 1)));
        }
        //    замеряем время
        System.out.println("get elements from arraylist in: " + (System.currentTimeMillis() - startTime) + " milis");



         //   фиксируем время
        startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfElementsToGet; i++) {
            linkedList.get((int) (Math.random() * (listSize - 1)));
        }
        //    замеряем время
        System.out.println("get elements from linkedlist in: " + (System.currentTimeMillis() - startTime) + " milis");

    }
}
