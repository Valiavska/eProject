package com.company.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

import com.company.hunter_hw2.Animal;

import com.company.hunter_hw2.Cat;

public class Lambda2 {

    public static void main(String[] args) {

        // Predicate

        // Predicates, response boolean, выполняет какое-то условие
        Predicate<String> predicateTest = (s) -> s.length() > 0;
        // "test("")" - predicate method, если длинна переменной "s" > 0 верни true
        boolean testStringLengthNotEmpty = predicateTest.test("test");                     // true
        System.out.println("test String Length Not Empty: " + testStringLengthNotEmpty);

        // negate() - predicate method, противоположный предыдущему,
        // если длинна переменной "s" > 0 верни false
        boolean negateStringLengthNotEmpty = predicateTest.negate().test("test");          // false
        System.out.println("negate String Length Not Empty: " + negateStringLengthNotEmpty);

        // проверка на nonNull
        Predicate<Boolean> nonNull = (o) -> o != null;
        boolean testNonNull = nonNull.test(Boolean.TRUE);
        System.out.println("test Non Null: " + testNonNull);

        // проверка на isNull
        Predicate<Boolean> isNull = (o) -> o == null;
        boolean testIsNull = isNull.test(Boolean.FALSE);
        System.out.println("test Is Null: " + testIsNull);

        // one more example of Predicate
        Predicate<String> isEmpty = o -> o.length() == 0;
        boolean testIsEmpty = isEmpty.test("");
        System.out.println("test Is Empty: " + testIsEmpty);                             // true

        // use negate()
        Predicate<String> isNotEmpty = isEmpty.negate();
        boolean testIsNotEmpty = isNotEmpty.test("");
        System.out.println("test Is Not Empty, use negate(): " + testIsNotEmpty);        // false
        System.out.println("____________________Predicate_____________________");


        // Functional Interfaces


        // Consumers
        // создаем Consumer, принимаем один элемент "p" типа "Cat" и выводим сообщение
        Consumer<Cat> greeter = p -> System.out.println("Hello, " + p.getName());
        // у "Consumers" есть один метод "accept()" внутри него мы создаем обьект "Cat"
        // void accept(T t); - этот метод void, поэтому мы ничего не возвращаем
        greeter.accept(new Cat("consumerCat", 4, "lion"));

        // Consumer - функциональный интерфейс, принимает обьект, но ничего не возвращает
        Consumer<String> stringConsumer = s -> System.out.println("Hello: " + s);
        stringConsumer.accept("Katya");
        System.out.println("____________________Consumer_____________________");


        // BiConsumer
        // BiConsumer - принимает два обьекта
        BiConsumer<String, Integer> biConsumer = (a, b) -> System.out.println("biConsumer 1: " + a + "\n biConsumer 2: " + b);
        biConsumer.accept("one", 1);
        System.out.println("____________________BiConsumer_____________________");


        // UnaryOperator
        // инициализируем обьект с помощью Supplier
        // Supplier - Functional Interface, не принимает никаких аргументов "()", но возвращает обьект типа "Cat"
        Supplier<Cat> catSupplier = () -> new Cat("consumerCat", 4, "lion");
        // у Supplier есть один метод get()
        Cat catFromSupplier = catSupplier.get();    // create new Cat

        // UnaryOperator инициализируем его, мы хотим чтобы он принимал "cat" и возвращал его
        // используем {} - если у нас больше одной опирации
        UnaryOperator<Cat> setUnaryOperator = (kitty -> {
            kitty.setName("catUnaryOperator");
            return kitty;
        });
        setUnaryOperator.apply(catFromSupplier);
        System.out.println("Unary Operator Set: " + catFromSupplier);
        System.out.println("____________________UnaryOperator - Supplier_____________________");


        // Function
        // Function<String, Integer> - функция принимает два параметра, мы будем строку преобразовывать в число
        // вводим переменную типа String "s" и операцию преобразования "Integer.valueOf(s)"
         Function<String, Integer> toInteger = s -> Integer.valueOf(s);
         // у Function есть метод apply()
         Integer resultConverted = toInteger.apply("123");
        System.out.println("result Converted from String to Integer: " + resultConverted);
        System.out.println("____________________Function_____________________");


        //  BinaryOperator
        // BinaryOperator принимает и возвращает один тип значения
        // вводим два параметра типа Integer "(a, b)", далее пишем, что мы с ними хотим сделать a * b
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        Integer applyResult = binaryOperator.apply(20, 30);
        System.out.println("apply Result" + applyResult);
        System.out.println("____________________BinaryOperator_____________________");

    }
}
