package com.company.calculator_exception_hw3;

// сами создаем свое исключение
public class NegativeNumberException extends Exception {

    private int number;

    public NegativeNumberException(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    //  добавляем этот переопределенный метод если происходит extends от RuntimeException
    @Override
    public String getMessage() {
        return "Only positive numbers allowed";
    }
}
