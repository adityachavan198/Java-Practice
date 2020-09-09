package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value 1:");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Value 2: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Select Operator (+, -, *, /) : ");
        String op = scanner.nextLine();
        switch (op) {
            case "+":
                result = addi(num1, num1);
                System.out.println("The result of " + num1 + " " + op + " = " + result);
                break;
            case "-":
                result = sub(num1, num1);
                System.out.println("The result of " + num1 + " " + op + " = " + result);
                break;
            case "*":
                result = mul(num1, num1);
                System.out.println("The result of " + num1 + " " + op + " = " + result);
                break;
            case "/":
                result = div(num1, num1);
                System.out.println("The result of " + num1 + " " + op + " = " + result);
                break;
            default:
                System.out.println("Invalid Operator");
        }


    }
    private static double addi(double n1, double n2) {
        return n1 + n2;

    }
    private static double sub(double n1, double n2) {
        return n1 - n2;

    }
    private static double mul(double n1, double n2) {
        return n1 * n2;

    }
    private static double div(double n1, double n2) {
        return n1 / n2;
    }

}
