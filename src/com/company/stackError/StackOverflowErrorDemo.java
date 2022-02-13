package com.company.stackError;

public class StackOverflowErrorDemo {
    //   вызов кода по кругу тоесть рекурсивно
    public static void main(String[] args) {
        methodA();
    }

    static public void methodA(){
        methodB();
    }

    static public void methodB(){
        methodA();
    }
}
