package com.company.lambdas;

import java.util.*;

public class Lambda1 {

    public static void main (String[] args) {

        List<String> names = Arrays.asList("peter", "anna", "mike", "kostya");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        //   если внутри будет больше одной операции тогда нужны фигурные скобки {} и  "return"
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });
        //одни из форм записи
        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        //  (a, b) - вводим два параметра,
        //  -> - значек лямбда, значит сделай с ними что-то,
        //  метод сравни  b.compareTo(a)
        Collections.sort(names, (a, b) -> b.compareTo(a));
        System.out.println(names);

        //   сортируем список в обратном порядке
        Collections.sort(names, Comparator.reverseOrder());
        System.out.println("Sorted in reverse order: " + names);


        //  сортировать, чтоб "null" был последним в списке
        List<String> names2 = Arrays.asList("peter", null, "anna", "mike", "kostya");
        //   используем method reference (String::compareTo)
        names2.sort(Comparator.nullsLast(String::compareTo));
        System.out.println("Names with null Last: " + names2);

        //  если приходит null, то чтоб тест не падал, можно перехватить исключение и сделать его ожиданным,
        //  способ 1
        List<String> names3 = null;
//        if (names3 == null) {
//            return;
//        }
//        names3.sort(Comparator.naturalOrder());
//        System.out.println(names3);

        //  способ 2
        List<String> names4 = Arrays.asList("peter", "anna", "mike", "kostya");
        System.out.println("some response: " + names4);
        //  будем делать операцию, если данный обьект присутствует
        //  конструкция ifPresent - говорит, если попадается имя которое не null "ofNullable(names4)",
        //  то (используем лямбду) возьми это имя "o" - локальная переменная (разовая) и отсортируй по ней
        //  если придет null программа упадет
        // ifPresent - является Consumer
        Optional.ofNullable(names4).ifPresent(o -> o.sort(Comparator.naturalOrder()));
        System.out.println("some response: " + names4);
    }
}
