package com.company;

import com.company.calculator_exception_hw3.NegativeNumberException;

import java.util.Scanner;

// the class name is capitalized Calculator {}
public class Calculator_hw1 {
	private String operation;
    //	данные получаем в программу с помощью Scanner
    //	Scanner class has scanner variable
	private Scanner scanner;

    //	генерируем конструктор, "public" методы доступные для пользователя,
	//	"private" - методы не доступные для пользователя
    //	если конструктор будет "private" мы не сможем создать обьект
	public Calculator_hw1() {
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
                //	NumberFormatException - ловим исключение, ex - название исключения(можно менять)
			} catch (NumberFormatException ex){
				System.out.println("Wrong input data!");
              //	ловим наше созданное исключение "NegativeNumberException" и обрабатываем его
			} catch (NegativeNumberException e) {
				System.out.println("our exception: NegativeNumberException");
			}
		}
	}
	// create private method calculate()
    //	if method calculationStep() is 'double' -> it should return something
    //	выбрасываем исключение через "throws"
	private double calculationStep() throws NegativeNumberException {
		System.out.println("enter first number:");
        //		Integer.parseInt - с консоли пытаемся считать Integer и ожидаем там число и
        //		если число не придет, то выводим исключение "NumberFormatException"
		int firstNumber = Integer.parseInt(scanner.nextLine());
         //	создаем ситуацию для исключения и пишем наше исключение через "	throw new "
		if (firstNumber < 0) {
			throw new NegativeNumberException(firstNumber);
		}

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

