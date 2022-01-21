package com.company.calculator_exception_hw3;

import java.util.Scanner;

public class CalculatorException {
    private String operation;
    private Scanner scanner;

    public CalculatorException() {
        this.scanner = new Scanner(System.in);
    }
    public void calculate(){
        while (!"q".equals(operation)) {
            try {
                System.out.println(calculationStep());
            } catch (ArithmeticException ax) {
                System.out.println("Exception: Division by zero!");
                //	NumberFormatException - ловим исключение, ex - название исключения(можно менять)
            } catch (NumberFormatException ex){
                System.out.println("Exception: Wrong input data!");
                //	ловим наше созданное исключение "NegativeNumberException" и обрабатываем его
            } catch (NegativeNumberException e) {
                System.out.println("our exception: NegativeNumberException");
            }
        }
    }

    //	выбрасываем исключение через "throws"
    private double calculationStep() throws NegativeNumberException {

        System.out.println("enter first number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        //	создаем ситуацию для исключения и пишем наше исключение через "	throw new "
        if (firstNumber < 0) {
            throw new NegativeNumberException(firstNumber);
        }

        System.out.println("enter second number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("enter operation: +, -, *, /, to perform or q if you want to quit: ");

        operation = scanner.nextLine();

        return performOperation(firstNumber, secondNumber);
    }

    private double performOperation(int firstNumber, int secondNumber) throws ArithmeticException {
        double result;

        switch (operation){
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                if (secondNumber == 0) {
                    throw new ArithmeticException();
                }
                break;
            default:
                result = 0;
                break;
        }

        return result;
    }

}

