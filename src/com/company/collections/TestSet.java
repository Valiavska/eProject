package com.company.collections;

import java.util.*;

public class TestSet {

    public static void main(String[] args) {

        Air air = new Air(9, 87, 8, "plane", "engine1", "boing747");
        Air air1 = new Air(9, 87, 8, "plane", "engine1", "boing747");
        Air air2 = new Air(10, 87, 8, "plane", "engine1", "boing747");
        Air air3 = new Air(11, 87, 8, "plane", "engine1", "boing747");

        AirComparator air4 = new AirComparator(9, 87, 8, "plane", "engine1", "boing747");
        AirComparator air5 = new AirComparator(9, 87, 10, "plane", "engine1", "boing747");
        AirComparator air6 = new AirComparator(10, 87, 4, "plane", "engine1", "boing747");
        AirComparator air7 = new AirComparator(11, 87, 8, "plane", "engine1", "boing747");
        AirComparator air8 = new AirComparator(11, 87, 8, "plane", "engine1", "boing747");

        //   set is not duplicate the objects,
        //   но чтоб работал "Set" - нужно переопределить метод "equals and hashcode
        Set <Air> airSet = new HashSet<>();
        airSet.add(air);
        airSet.add(air1);
        airSet.add(air2);
        System.out.println("set of planes: " + airSet);

        //    TreeSet - сортировка без дубликата
        Set<Integer> newvariable = new TreeSet<>();
        newvariable.add(1);
        newvariable.add(5);
        newvariable.add(2);
        System.out.println("Print sorted variable: " + newvariable);


        //   1_keys. TreeSet - сортировать обьект (без дубликатов) не может, нужно имплементировать интерфейс  Comparable в класс Air
        Set <Air> airSet1 = new TreeSet<>();
        airSet1.add(air);
        airSet1.add(air1);
        airSet1.add(air2);
        airSet1.add(air3);
        System.out.println("set of air: " + airSet1);
        System.out.println("**********************************************");


        //   2_keys. Comparator - сортировать обьект (без дубликатов) и сравнить его
        Comparator<Air> comparator = new Comparator<Air>() {
            @Override
            public int compare(Air o1, Air o2) {
                return o1.getId() - o2.getId();
            }
        };
        Set <Air> airSet2 = new TreeSet<>(comparator);
        airSet2.add(air);
        airSet2.add(air1);
        airSet2.add(air2);
        airSet2.add(air3);
        System.out.println("set of air, comparator: " + airSet2);
        System.out.println("**********************************************");


        //   3_keys. инициализируем IdComparator, сортируем по id, имплементируем интерфейс  Comparator в класс IdComparator
        IdComparator idComparator = new IdComparator();
        TreeSet<AirComparator> airSet3 = new TreeSet<>(idComparator);
        airSet3.add(air4);
        airSet3.add(air5);
        airSet3.add(air6);
        airSet3.add(air7);
        System.out.println("set of air, comparator_id: " + airSet3);
        System.out.println("**********************************************");


        //   4_keys. инициализируем WinsComparator, сортируем по wins, имплементируем интерфейс  Comparator в класс IdComparator
        WinsComparator winsComparator = new WinsComparator();
        TreeSet<AirComparator> airSet4 = new TreeSet<>(winsComparator);
        airSet4.add(air4);
        airSet4.add(air5);
        airSet4.add(air6);
        airSet4.add(air7);
        System.out.println("set of air, comparator_wins: " + airSet4);
        System.out.println("**********************************************");

        System.out.println("First element: " + airSet4.first());   /* вывести первый элемент  */
        System.out.println("Last element: " + airSet4.last());    /* вывести последний элемент  */
        System.out.println("headSet element: " + airSet4.headSet(air5)); /* все элементы c начала и до air5  */
        System.out.println("tailSet element: " + airSet4.tailSet(air4));  /* все элементы c air4 и до конца  */
        System.out.println("comparator element: " + airSet4.comparator());
        System.out.println("**********************************************");

        //  создаем список с одинаковыми элементами
        List<AirComparator> airComparatorList = new ArrayList<>();
        airComparatorList.add(air7);
        airComparatorList.add(air8);
        System.out.println(airComparatorList);
        //  с помощью Set уберем дубликаты
        Set<AirComparator> noDuplicates = new HashSet<>(airComparatorList);
        System.out.println(noDuplicates);
    }
}
