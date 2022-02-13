package com.company.collections;

import java.util.*;

public class TestCollection {

    public static void main(String[] args) {
        //  Collection - создаем пустую коллекцию (инициализируем коллекцию), <String> - указываем тип данных который будет содержать коллекция,
        //   "testname" - название коллекции. Так как это ссылочный тип создаем через ключевое слово "new".
        //   Создаем имплементацию  LinkedList
        Collection <String> testname = new LinkedList<>();

        testname.add("one");
        testname.add("two");
        testname.add("three");
        testname.add("four");
        System.out.println(testname);
        testname.add("five");

        //   создаем итератор из нашей коллекции
        Iterator iterator = testname.iterator();
        while (iterator.hasNext()) {
            System.out.println("in collection iteration: " + iterator.next());
        }
         //   получаем из нашей коллекции "size, contains, remove"
        System.out.println(testname.size());
        System.out.println(testname.contains("one"));
        System.out.println(testname.remove("one"));
        System.out.println(testname);

        //   create second collection "collectionToRetain"
        Collection<String> collectionToRetain = new LinkedList<>();
        collectionToRetain.add("six");
        collectionToRetain.add("one");
        collectionToRetain.add("two");
        //   коллекция "collectionToRetain" - удалилась, а  коллекция "testname" - сложилась из новых параметров,
        //   которые дублировались с коллекцией  "collectionToRetain"
        testname.retainAll(collectionToRetain);
        System.out.println(testname);

        //   create array from collection
        Object[] objects = collectionToRetain.toArray();
        System.out.println(Arrays.toString(objects));
    }
}
