package com.Himraj.basic_questions;

import java.util.Scanner;

// Take two numbers and print the sum of both.
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.println(num1 + num2);
    }
}
