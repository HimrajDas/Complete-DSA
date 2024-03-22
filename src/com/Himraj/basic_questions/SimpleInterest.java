package com.Himraj.basic_questions;


import java.util.Scanner;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        float principle = scanner.nextFloat();
        System.out.print("Enter time(in years): ");
        float time = scanner.nextFloat();
        System.out.print("Enter rate: ");
        float rate = scanner.nextFloat();

        float finalAmount = principle * (1 + rate * time);
        System.out.println("Simple Interest: " + finalAmount);
    }
}
