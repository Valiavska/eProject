package com.company.streamapi;

import com.company.plane.Plane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreationResultAndInitialization {

    public static void main(String[] args) {

        Plane plane = new Plane(9, 87, 8, "plane1", "engine1", "boing747");
        Plane plane1 = new Plane(9, 87, 67, "plane2", "engine1", "boing747");
        Plane plane2 = new Plane(9, 87, 27, "plane3", "engine1", "boing747");

        List<Plane> stringList = new ArrayList<>();
        stringList.add(plane);
        stringList.add(plane1);
        stringList.add(plane2);



        // инициализируем stream, выполняем predicate, и собираем результат того что получилось в collect
        // мы с помощью стрима "stream" инициализируем поток, по которому у нас по одному
        // все элементы проходят все этапы операций  (вместо работы for-each)
        List<Plane> collectWingsMore23 = stringList.stream()
                                        .filter(e -> e.getWings() > 23)
                                        .collect(Collectors.toList());
        System.out.println("collect Wings More 23: " + collectWingsMore23);



        // count elements
        // .count() - результат stream
        long countWingsMore23 = stringList.stream()
                               .filter(e -> e.getWings() > 23)
                               .count();
        System.out.println("count Wings More 23: " + countWingsMore23);



        // map - вывести имена самолетов
        List<String> namesOfPlanes = stringList.stream()
                                         .map(e -> e.getName())
                                         .collect(Collectors.toList());
        System.out.println("names Of Planes: " + namesOfPlanes);


        // .anyMatch() - результат stream
        // .anyMatch() - если хоть один элемент совпадает
        List<String> list1 = Arrays.asList("1", "2", "3", "4");
        boolean anyMatchBoolean = list1.stream()
                         .anyMatch(e -> e.contains("2"));
        System.out.println("result any Match Boolean: " + anyMatchBoolean);


        // .allMatch() - если все элементы совпадают
        List<String> list2 = Arrays.asList("1", "2", "3", "4");
        boolean allMatchBoolean = list2.stream()
                                       .allMatch(e -> e.contains("2"));
        System.out.println("result all Match Boolean: " + allMatchBoolean);

        // .min() - результат stream
        // так как .min() возвращает Optional тип, то допишем .orElse() чтоб тип поменялся на String
        List<String> list3 = Arrays.asList("1", "2", "3", "4");
        String resultMin = list3.stream()
                              .min((o1, o2) -> o1.compareTo(o2))
                              .orElse("nothing");
        System.out.println("result Min: " + resultMin);


        // .reduce() - результат stream
        // так как в .reduce() у нас Strings то выполняется конкатенация
        List<String> list4 = Arrays.asList("1", "2", "3", "4");
        Optional<String> reduce = list4.stream()
                                       .reduce((e1, e2) -> e1 + e2);
        String resultReduced = reduce.orElse("nothing");
        System.out.println("result Reduced: " + resultReduced);


        // .forEach() - результат stream
        // a - is consumer,
        // forEach в данном примере просто проводит операцию перечень элементов, ничего не возвращат
        List<String> list5 = Arrays.asList("1", "2", "3", "4");
        list5.stream().forEach(a -> System.out.println(a));
        System.out.println("_______________________результат stream__________________________-");


        // инициализируем stream из обьектов
        Stream<Plane> objectStream = stringList.stream();


        // инициализируем stream из коллекции
        List<String> stringList1 = Arrays.asList("1", "2", "3", "4");
        Stream<String> stringStreamFromCollection = stringList1.stream();

        // инициализируем stream using "of()" method
        Stream<String> stringStreamUsingOf = Stream.of("1", "2", "3", "4");

        // инициализируем stream using arrays
        String[] array = {"a", "b", "c", "d"};
        Stream<String> streamArray = Arrays.stream(array);

        // инициализируем stream from string chars()
        IntStream charsStream = "abc".chars();
        System.out.println("_______________________инициализируем stream__________________________-");

    }

}
