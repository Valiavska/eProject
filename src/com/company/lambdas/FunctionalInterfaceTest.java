package com.company.lambdas;

import static java.lang.Math.sqrt;

public class FunctionalInterfaceTest {

    // static final int - значит, что переменная "INT" помечается как константа
    public static final int INT = 100;

    // аннотация ключивое слово FunctionalInterface
    // в самом классе проинициализировали контракт @FunctionalInterface
    @FunctionalInterface
    // interface name
    interface Formula {
        // описаны 3 метода: calculate, sqrt, positive
        // метод "calculate"- является одним методом без реализации
        double calculate(int a);
        // метод "sqrt" - с реализацией, sqrt - нахождение корня из "a"
        default double sqrt(int a) {
            return Math.sqrt(positive(a));
        }
        // метод "positive" - с реализацией
        static int positive(int a) {
            // если "a > 0" возвращает "a", иначе  = 0
            return a > 0 ? a : 0;
        }
    }

    public static void main(String[] args) {
        // создаем обьект "formula1"
        Formula formula1 = new Formula() {
            // нужно переопределить метод "calculate" чтобы с ним работать
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        double result = formula1.calculate(100); // 100.0
        double resultSqrt = formula1.sqrt(-23); // 0.0
        // так как метод "positive" он static, то можем его вызывать через тип обьекта "Formula"
        double resultPositive = Formula.positive(-4); // 0.0
        System.out.println("Result from f interface: " + result);
        System.out.println("result Sqrt: " + resultSqrt);
        System.out.println("result Positive: " + resultPositive);


        // do with Lambda
        // так можно сделать только с функциональным интерфейсом, так как у него один метод должен быть без реализации
        // значит, что -> для входного параметра "a" который пришел из метода "calculate"
        // реализуй метод "sqrt" - sqrt(a * 100)
        Formula formulaWithLambda = a -> sqrt(a * INT);
        double resultFormulaFromLambda = formulaWithLambda.calculate(100);
        System.out.println("Result from Lambda: " + resultFormulaFromLambda);
    }
}
