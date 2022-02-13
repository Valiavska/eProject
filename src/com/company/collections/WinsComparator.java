package com.company.collections;

import java.util.Comparator;

public class WinsComparator implements Comparator<AirComparator> {
    @Override
    public int compare(AirComparator o1, AirComparator o2) {
         // сортировать по крыльям в порядке возрастания
        return o1.getWings() - o2.getWings();
    }

    @Override
    public String toString() {
        return "WinsComparator{}";
    }
}
