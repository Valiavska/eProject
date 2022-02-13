package com.company.amazon_collection_hw5;

import java.util.Comparator;

public class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int o1Length = o1.getName().length();
        int o2length = o2.getName().length();
        return Integer.compare(o1Length, o2length);
    }
}
