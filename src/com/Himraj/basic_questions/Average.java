package com.Himraj.basic_questions;

import java.util.Scanner;

// Calculate Average Of N Numbers
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of values(N): ");
        int N = sc.nextInt();
        double totalSum = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Enter value " + i + ": ");
            double value = sc.nextDouble();
            totalSum += value;
        }

        double average = totalSum / N;

        System.out.println("Average: " + average);
    }
}
