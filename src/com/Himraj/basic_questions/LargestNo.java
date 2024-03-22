package com.Himraj.basic_questions;

import java.util.Scanner;

// Take 2 numbers as input and print the largest number.
public class LargestNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();

        System.out.println(Math.max(n1, n2) + " is larger.");
    }
}
