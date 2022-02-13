package com.company.amazon_collection_hw5;

import java.util.Comparator;

public class PriceComparatorKeys1 implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
