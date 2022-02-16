package com.company.streamapi;

import java.util.Arrays;
import java.util.List;

public class Test {
    private static long counter;

    // работает с ошибкой
    public static void main(String[] args) {

        List<String> stringList3 = Arrays.asList("a3", "b2", "c4", "b2");


        counter = 0;
        long count4 = stringList3.stream().map(a -> {
            wasCalled();
            System.out.println("counter: " + counter);
            return a.toLowerCase();
        }).skip(3).count();
        System.out.println("was called: " + counter);
        System.out.println(count4);
        System.out.println("________________________invocation example 2    keys_1_______________________");


        // ACTUAL RESULT:
        //was called: 0
        //1

        //EXPECTED RESULT
        //was called: 4
        //1

    }

    private static void wasCalled() {
        counter++;
    }

}
