package com.Himraj.basic_questions;

import java.util.Scanner;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();
        System.out.print("Enter an operation: ");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("addition: " + (n1 + n2));
                break;
            case '/':
                System.out.println("Division: " + (n1 / n2));
                break;
            case '*':
                System.out.println("Multiplication: " + (n1 * n2));
                break;
            case '-':
                System.out.println("Subtraction: " + (n1 - n2));
                break;
        }
    }

}
