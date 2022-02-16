package com.company.streamapi;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreationUsingPrivateStaticVoid {

    public static void main(String[] args) {

        test1();
        test2();
        test3();
        test3_2();
        test4();
        testRange();
    }

    private static void test1() {
        int[] ints = {1, 3, 5, 7, 11};
        Arrays
                .stream(ints)
                .average()
                .ifPresent(System.out::println);
        System.out.println("____________________Arrays______________________");
    }

    // инициализируем stream using builder()
    public static void test2() {
        // генерируем stream integers
        IntStream
                .builder()
                .add(1)
                .add(2)
                .add(8)
                .add(4)
                .add(11)
                .build()
                .average()
                .ifPresent(System.out::println);
        System.out.println("____________________builder______________________");
    }

    // инициализируем stream using range(), keys_1
    public static void test3() {
        IntStream
                .range(2, 9)
                .average()
                .ifPresent(System.out::println);
        System.out.println("____________________range(), keys_1______________________");
    }


    // инициализируем stream using range() and forEach, keys_2
    public static void test3_2() {
        IntStream
                .range(2, 9)
                .forEach(e -> System.out.println(e));
        System.out.println("____________________range() and forEach, keys_2______________________");
    }

    // инициализируем stream используя ссылочный тип обьектов
    private static void test4() {
        // new BigDecimal("1.2") - создаем ссылочный тип обьектов
        Stream.of(new BigDecimal("1.2"), new BigDecimal("3.7"))
              .mapToDouble(BigDecimal::doubleValue)
              .average()
              .ifPresent(System.out::println);
        System.out.println("____________________Stream.of - using object reference type______________________");
    }

    private static void testRange() {
        //
    }
}
