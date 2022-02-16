package com.company.streamapi;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonStream {

    // create встроенный класс
    static class Person {
        String name;
        int age;

        // object Person, который содержит имя и возраст
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }


        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        // create list of Persons
        List<Person> persons = Arrays.asList(
                new Person("Max", 3),
                new Person("Lilya", 3),
                new Person("Katya", 2),
                new Person("Anna", 8),
                new Person("Kostya", 1)
        );
        // используем методы над нашими Persons
        test1(persons);
        test2(persons);
        test3(persons);
        test4(persons);
        test5(persons);
        test6(persons);
    }

    private static void test1(List<Person> persons) {

        // filter(p -> p.name.startsWith("K")) - у переменной "p" есть имя \
        // по которому мы будем фильтровать persons по первой букве
        List<Person> filtered = persons
                .stream()
                .filter(p -> p.name.startsWith("K"))
                .collect(Collectors.toList());
        System.out.println("filtered persons" + filtered);
    }


    private static void test2(List<Person> persons) {

        // groupingBy(p -> p.age) - сгрупировать по возрасту
        // map - выводит ключ и значение, если будет одинаковый возраст, то выведит ключ и все имена под этим ключем
        Map<Integer, List<Person>> personsByAge = persons
                .stream()
                .collect(Collectors.groupingBy(p -> p.age));

        personsByAge.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
    }


    private static void test3(List<Person> persons) {

        // averagingInt - средний возраст
        Double avarageAge = persons
                .stream()
                .collect(Collectors.averagingInt(p -> p.age));

        System.out.println("avarage Age: " + avarageAge);;
    }


    private static void test4(List<Person> persons) {

        // summarizingInt - сумма
        IntSummaryStatistics ageSummary = persons
                .stream()
                .collect(Collectors.summarizingInt(p -> p.age));

        System.out.println("age Summary: " + ageSummary);;
    }


    private static void test5(List<Person> persons) {

        String names = persons
                .stream()
                .filter(p -> p.age >= 3)
                .map(p -> p.name)
                .collect(Collectors.joining(" and ", "In Gernany ", " are of legal age!"));

        System.out.println("joining: " + names);;
    }


    private static void test6(List<Person> persons) {

        // (name1, name2) -> name1 + ";" + name2) - делиметр для двух одинаковых значений в списке
        Map<Integer, String> map = persons
                .stream()
                .collect(Collectors.toMap(
                        p -> p.age,
                        p -> p.name,
                        (name1, name2) -> name1 + ";" + name2));

        System.out.println();

        System.out.println("map: " + map);;
    }

}
