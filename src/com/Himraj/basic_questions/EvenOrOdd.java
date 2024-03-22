package com.Himraj.basic_questions;

import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take input from the user.
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (n % 2 == 0) System.out.println("even!");
        else System.out.println("odd!");
    }
}
