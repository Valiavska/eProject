package com.company.collections;

import java.util.*;

public class TestList {

    public static void main(String[] args) {

        //  задаем фиксированное capacity, мы закладываем только 10 элементов, которые будут хранится в памяти,
        //  если элементов будет больше 10ти, то capacity перестроится, null не будет
        List<Integer> listAsNew = new ArrayList<>(10);
        listAsNew.add(3);
        listAsNew.add(8);
        listAsNew.add(4);
        listAsNew.add(33);
        listAsNew.add(1);
        System.out.println(listAsNew);

        //  remove элемент под индексом 3
        listAsNew.remove(3);
        System.out.println(listAsNew);
        //  size - вывести размер
        System.out.println(listAsNew.size());
        System.out.println("**********************************************");


         //   второй способ создания  ArrayList - мы можем сложить его из массива
        List<Integer> listFromArray = Arrays.asList(3,2,6,1,8,4);
        System.out.println("List: " + listFromArray);
        //  выводим второй элемент
        System.out.println("List second element: " + listFromArray.get(2));
        System.out.println("**********************************************");


        //   method "sort" collection
        String name1 = "Katya";
        String name2 = "Vanya";
        String name3 = "Anna";
        String name4 = "Kostya";

        List<String> nameList = new ArrayList<>();
        nameList.add(name1);
        nameList.add(name2);
        nameList.add(name3);
        nameList.add(name4);
        Collections.sort(nameList);
        System.out.println("Sorted name list: " + nameList);
        System.out.println("**********************************************");
    }
}
