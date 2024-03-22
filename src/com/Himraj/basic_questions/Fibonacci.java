package com.Himraj.basic_questions;


import java.math.BigInteger;
import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers.
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        System.out.print("Enter the nth fibonacci number: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }

        System.out.println("nth fibonacci number: " + b);
    }
}

