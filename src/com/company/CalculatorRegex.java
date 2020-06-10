package com.company;

import java.util.Scanner;

public class CalculatorRegex {
    public static void main(String[] args) {
        double result = 0d;
        do  {
            Scanner calcScan = new Scanner(System.in);
            if (calcScan.findInLine("(-?\\d+\\.?\\d*)?\\s*(\\S)\\s*(-?\\d+\\.?\\d*)") != null) {
                if (calcScan.match().group(1) != null) { //первое число из калькулятора
                    double numberOne = Double.parseDouble(calcScan.match().group(1)); //первое число из калькулятора
                    double numberTwo = Double.parseDouble(calcScan.match().group(3)); //второе число из калькулятора
                    result = action(numberOne, numberTwo, calcScan.match().group(2)); //символ между числами
                } else {
                    System.out.println("Error");
                }
                System.out.println(result);
            } else {
                System.out.println("Error");
            }
        } while(true);

    }

    public static double addition (double x , double y){
        return x+y;
    }

    public static double substraction (double x, double y) {
        return x - y;
    }

    public static double division (double x, double y){
        return x / y;
    }

    public static double multiplication (double x, double y)
    {
        return x * y;
    }

    public static double action(double x, double y, String operator){
        switch (operator) {
            case "+":
                return  addition(x, y);
            case "-":
                return  substraction(x, y);
            case "/":
                return division(x, y);
            case "*":
                return multiplication(x, y);
            default:
                return 0;
        }
    }
}
