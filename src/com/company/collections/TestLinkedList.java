package com.company.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        //  add elements to the LinkedList
        linkedList.add("Stive");
        linkedList.add("Carl");
        linkedList.add("Bob");
        linkedList.add("Katya");
        linkedList.add("Kostya");
        System.out.println(linkedList);

        //  adding an element to the first position
        linkedList.addFirst("Anna");

        //  adding an element to the last position
        linkedList.addLast("Petya");

        //  adding an element to the 3ed position
        linkedList.add(4, "New element");

        //  Iterating LinkdList
        Iterator<String> iterator = linkedList.iterator();
         //   пока есть у linkedList следующий элемент, выводи вот это
        while (iterator.hasNext()) {
            System.out.println("This is LinkedList: " + iterator.next());
        }
    }
}
