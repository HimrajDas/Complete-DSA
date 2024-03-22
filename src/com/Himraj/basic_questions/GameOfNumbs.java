package com.Himraj.basic_questions;

import java.util.Scanner;

// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.
public class GameOfNumbs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumOfNeg = 0;
        int sumOfPosEven = 0;
        int sumOfPosOdd = 0;
        boolean running = true;
         while (running) {
             System.out.print("Keep entering numbers until your fingers break: ");
             int n = input.nextInt();
             if (n < 0) sumOfNeg += n;
             if (n > 0 && n % 2 == 0) sumOfPosEven += n;
             if (n > 0 && n % 2 != 0) sumOfPosOdd += n;
             if (n == 0) running = false;
         }

        System.out.println("Sum Of Negative Numbers: " + sumOfNeg);
        System.out.println("Sum of Positive Even Numbers: " + sumOfPosEven);
        System.out.println("Sum Of Positive Odd Numbers: " + sumOfPosOdd);
    }


}
