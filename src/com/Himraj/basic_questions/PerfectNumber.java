package com.Himraj.basic_questions;

import java.util.Scanner;

// perfect number in java.
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tell me which number to check: ");
        int n = input.nextInt();
        int sumOfDivisors = 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sumOfDivisors += i;
                if (i != n / i) sumOfDivisors += n / i; // avoid duplicate addition.
            }
        }

        if (sumOfDivisors == n) System.out.println("It's perfect.");
        else System.out.println("It's not perfect.");

    }
}
