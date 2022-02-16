package com.company.streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrderOfInvocation {

    private static long counter;

    public static void main(String[] args) {

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


        counter = 0;
        // если мы не хотим работать с типом Optional которое возвращает метод findFirst(),
        // то дописываем метод .orElse() и тип возвращающих данных будет String
        String returnString = stringList3.stream()
                                     .filter(a -> {
                                         wasCalled();
                                         System.out.println("element 2: " + a);
                                         return a.contains("2");
                                     })
                                     .map(a -> {
                                         System.out.println("in map: " + a);
                                         return a.toUpperCase();
                                     })
                                     .findFirst()
                                     .orElse("default");
        System.out.println("was called: " + counter + "\n result: " + returnString);
        System.out.println("________________________invocation example 2_______________________");


        // вызываем элемент которого нет в списке stringList3, вернется исключение,
        // чтоб его обработать можем добавить orElse()
        counter = 0;
        Optional<String> returnException = stringList3.stream()
                                            .filter(a -> {
                                                wasCalled();
                                                System.out.println("element 2: " + a);
                                                return a.contains("5");
                                            })
                                            .map(a -> {
                                                System.out.println("in map: " + a);
                                                return a.toUpperCase();
                                            })
                                            .findFirst();
        String value = returnException.orElse("default");
        System.out.println("was called: " + counter + "\n result: " + value);
        System.out.println("________________________invocation example 3_______________________");


        // keys_1
        // order of invocation - порядок вызова
        // для всех елементов выполняется ".map" потом скипаются 3 елемента .skip(3)
        counter = 0;
        long count4 = stringList3.stream().map(a -> {
                                     wasCalled();
                                     System.out.println("counter: " + counter);
                                     return a.toLowerCase();
                                 }).skip(3).count();
        System.out.println("was called: " + counter);
        System.out.println(count4);
        System.out.println("________________________invocation example 2    keys_1_______________________");


        // keys_2
        // при изменении положения .skip(3) уменьшается коллекция (так как .map выведиться только 1 раз)
        counter = 0;
        long count5 = stringList3.stream().skip(3).map(a -> {
            wasCalled();
            System.out.println("counter: " + counter);
            return a.toLowerCase();
        }).count();
        System.out.println("was called: " + counter);
        System.out.println(count5);
        System.out.println("________________________invocation example 2    keys_2_______________________");

    }

    // метод который увеличивает счетчик, чтобы посмотреть, сколько раз мы туда зашли
    private static void wasCalled() {
        counter++;
    }

}
