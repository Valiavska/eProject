package com.company.streamapi;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Creation {

    private static int counter;

    public static void main(String[] args) {

//        test1();
//        test2();
//        test3();
//        test4();
//        testRange();

        // to show that it can't be used multiple times
        //терминальная операция может быть вызвана только один раз за один stream

        // keys 1
        // инициализируем коллекцию
        List<String> stringList = Arrays.asList("a", "b", "c", "b");
        // открываем stream для обьекта "stringList", вызываем промежуточную операцию "filter",
        // он принимает predicate, который мы сделаем из lambda
        // lambda (e -> e.equals("b")) - создаем временную переменную и проверяем равна ли эта переменная "b"
        Stream<String> stringStream = stringList.stream()
                                     .filter(e -> e.equals("b"));
        // count() - терминальная операция (завершающая)
        long count = stringStream.count();
        System.out.println("Count of 'b' elements: " + count);
        System.out.println("________________________keys 1_______________________");


        // keys 2
        // если нужно вызвать несколько терминальных опираций после использования stream
        List<String> stringList2 = Arrays.asList("a", "b", "c", "b");
        Stream<String> stringStream2 = stringList2.stream()
                                                .filter(e -> e.equals("b"));
        // все полученные элементы соберем в список
        List<String> all = stringStream2.collect(Collectors.toList());
        int count2 = all.size();
        System.out.println("Count of 'b' elements: " + count2);
        System.out.println("All elements: " + all);
        System.out.println("________________________keys 2_______________________");


        // keys 3
        // если нужно вызвать несколько терминальных опираций после использования stream
        List<String> stringList3 = Arrays.asList("a3", "b2", "c4", "b2");
        List<String> all3 = stringList3.stream()
                                    .filter(e -> e.equals("b2"))
                                    .collect(Collectors.toList());
        int count3 = all3.size();
        System.out.println("Count of 'b' elements: " + count3);
        System.out.println("All elements: " + all3);
        System.out.println("________________________keys 3_______________________");



        // lazy invocation
        counter = 0;
        // тестируем коллекцию, содержит ли она символ "2"
        // так как вызывается два метода в конструкции lambda, то ставим фигурные скобки {} и ключевое слово "return"
        Optional<String> with2 = stringList3.stream()
                                             .filter(a -> {
                                                 wasCalled();
                                                 System.out.println("element 2: " + a);
                                                 return a.contains("2");
                                             })
                                             .map(a -> {
                                                 System.out.println("in map: " + a);
                                                 return a.toUpperCase();
                                             })
                                             .findFirst();
        // как работает программа: берем со списка stringList3 первый элемент "a", увеличиваем счетчик и печатаем результат,
        // далее проверяем (return a.contains("2");) содержит ли элемент символ "2", если нет его, то переходим на следующий элемент,
        // так как следующий элемент содержит символ "2" мы переходим к ".map" и печатаем результат
        System.out.println("was called: " + counter + "\n result: " + with2);
        System.out.println("________________________invocation example 1_______________________");


        // order of invocation
        counter = 0;
        long count4 = stringList3.stream().map(a -> {
                                     wasCalled();
                                     System.out.println("counter: " + counter);
                                     return a.toLowerCase();
                                 }).skip(2).count();
        System.out.println("was called: " + counter);
        System.out.println(count4);
        System.out.println("________________________invocation example 2_______________________");

    }

    // метод который увеличивает счетчик, чтобы посмотреть, сколько раз мы туда зашли
    private static void wasCalled() {
        counter++;
    }


    private static void test4() {

        Stream.of(new BigDecimal("1.2"), new BigDecimal("3.7"))
              .mapToDouble(BigDecimal::doubleValue)
              .average()
              .ifPresent(System.out::println);
    }
}
