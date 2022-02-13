package com.company.collections;

import java.util.Comparator;

public class IdComparator implements Comparator <AirComparator> {

    @Override
    public int compare(AirComparator o1, AirComparator o2) {
        return o1.getId() - o2.getId();
    }
}
