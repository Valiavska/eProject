package com.company.annotations;

public class MainBoxSize {

    public static void main(String[] args) {

        BigBox bigBox = new BigBox();
        SmallBox smallBox = new SmallBox();

        for (int i = 0; i < 15; i++) {
            System.out.println("Adding to big box number: " + i);
            bigBox.addToBox("a");
            System.out.println("Adding to small box number: " + i);
            smallBox.addToBox("b");
        }
        System.out.println(bigBox.values);
        System.out.println(smallBox.values);
    }
}
