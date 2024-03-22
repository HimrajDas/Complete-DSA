package com.Himraj.basic_questions;

import java.util.Scanner;

// Take a number as input and print the multiplication table for it.
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}
