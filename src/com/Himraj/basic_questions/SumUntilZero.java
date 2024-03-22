package com.Himraj.basic_questions;

import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the sum of all numbers
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        boolean flag = true;
        int ans = 0;
        while (flag) {
            int n = input.nextInt();
            ans += n;
            if (n == 0) flag = false;
        }

        System.out.println("Sum of all: " + ans);
    }
}
