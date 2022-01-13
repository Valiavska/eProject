package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

// the class name is capitalized Calculator {}
public class Calculator {
	private String operation;
    //	данные получаем в программу с помощью Scanner
    //	Scanner class has scanner variable
	private Scanner scanner;

	public Calculator() {
		this.scanner = new Scanner(System.in);
	}
    // create public method calculate() / Public -> entry point into the program, into the Calculator class
    //	if method calculate() is 'void' -> it return nothing
	public void calculate(){
//		программа будет работать до того момента, пока то, что мы введем в переменную operation не станет равным "q"
		while (!"q".equals(operation)) {
			try {
                //call method calculationStep() / if the word starts with a LOWERCASE letter and is followed by parentheses,
				// so this is the name of a method or function
				System.out.println(calculationStep());
			} catch (NumberFormatException ex){
				System.out.println("Wrong input data!");
			}
		}
	}
	// create private method calculate()
    //	if method calculationStep() is 'double' -> it should return something
	private double calculationStep() {
		System.out.println("enter first number:");
		int firstNumber = Integer.parseInt(scanner.nextLine());
		System.out.println("enter second number:");
		int secondNumber = Integer.parseInt(scanner.nextLine());
		System.out.println("enter operation: +, -, *, /, to perform or q if you want to quit: ");

        //  считываем строку scanner.nextLine()
		operation = scanner.nextLine();

		//to remove when other operations added
//		if (!"-".equals(operation))  {
//			throw new UnsupportedOperationException(String.format("The operation '%s' is not supported", operation));
//		}
		return performOperation(firstNumber, secondNumber);
	}


	// create private method performOperation()
	private double performOperation(int firstNumber, int secondNumber) {
		double result;

		switch (operation){
			case "+":
                //	call methods plus()
				result = plus(firstNumber, secondNumber);
				break;
			case "-":
				result = minus(firstNumber, secondNumber);
				break;
			case "*":
				result = multiply(firstNumber, secondNumber);
				break;
			case "/":
				result = division(firstNumber, secondNumber);
				break;
			default:
				result = 0;
				break;
		}

		return result;
	}
    // create private methods plus(), minus(), multiply(), division()
    // if method plus() is 'int' -> it should return something
	private int plus(int numberOne, int numberTwo){
		return numberOne + numberTwo;
	}
	private int minus(int numberOne, int numberTwo){
		return numberOne - numberTwo;
	}
	private int multiply(int numberOne, int numberTwo){
		return numberOne * numberTwo;
	}
	private double division(int numberOne, double numberTwo){ return numberOne / numberTwo; }

}

