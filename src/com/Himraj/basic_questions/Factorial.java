package com.Himraj.basic_questions;

import java.math.BigInteger;
import java.util.Scanner;

// find the factorial.
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        BigInteger ans = BigInteger.valueOf(1);
        for (int i = n; i >= 1; i--) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }

        System.out.println(ans);

    }
}
