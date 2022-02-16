package com.company.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class IntermediateOperations {

    public static void main(String[] args) {

        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");


        // filtering

        stringCollection
                .stream()
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);
        System.out.println("__________________filtering___________________");


        // sorting

        stringCollection
                .stream()
                .sorted()
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);
        System.out.println("__________________sorting___________________");


        // mapping

        stringCollection
                .stream()
                .map(s -> s.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println("__________________mapping___________________");


        // matching

        boolean anyStartsWithA = stringCollection
                .stream()
                .anyMatch(s -> s.startsWith("a"));
        System.out.println("any Starts With A:" + anyStartsWithA);

        boolean allStartsWithA = stringCollection
                .stream()
                .allMatch(s -> s.startsWith("a"));
        System.out.println("all Starts With A: " + allStartsWithA);
        System.out.println("__________________matching___________________");


        // counting

        long startsWithB = stringCollection
                .stream()
                .filter(s -> s.startsWith("b"))
                .count();
        System.out.println("starts With B: " + startsWithB);
        System.out.println("__________________counting___________________");


        // reducing

        Optional<String> reduced = stringCollection
                .stream()
                .sorted()
                .reduce((s1, s2) -> s1 + "#" + s2);
        reduced.ifPresent(System.out::println);
        System.out.println("__________________reducing___________________");

    }
}
