package com.company.streamapi;

import com.company.plane.Plane;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream {

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
        long countWingsMore23 = stringList.stream()
                               .filter(e -> e.getWings() > 23)
                               .count();
        System.out.println("count Wings More 23: " + countWingsMore23);



        // map - вывести имена самолетов
        List<String> namesOfPlanes = stringList.stream()
                                         .map(e -> e.getName())
                                         .collect(Collectors.toList());
        System.out.println("names Of Planes: " + namesOfPlanes);
    }
}
