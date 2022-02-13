package com.company.streamapi;

import java.util.Arrays;
import java.util.List;

public class Test {

    private static int counter;

    public static void main(String[] args) {

        // order of invocation
        counter = 0;
        List<String> stringList3 = Arrays.asList("a3", "b2", "c4", "b2");
        long count4 = stringList3.stream().map(y -> {
            wasCalled();
            System.out.println("counter: " + counter);
            return y.toLowerCase();
        }).skip(2).count();

        System.out.println("was called: " + counter);
        System.out.println(count4);
        System.out.println("________________________invocation example 2_______________________");

    }

    // метод который увеличивает счетчик, чтобы посмотреть, сколько раз мы туда зашли
    private static void wasCalled() {
        counter++;
    }

}
