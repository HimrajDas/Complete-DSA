package com.Himraj.basic_questions;

import java.util.Scanner;

// Subtract the Product and Sum of Digits of an Integer
public class ProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.print("Difference between sum and product of this integer is: " + (productOfInteger(n) - sumOfInteger(n)));
    }

    public static int productOfInteger(int n) {
        int ans = 1;
        while (n > 0) {
            int digit = n % 10;
            ans *= digit;
            n /= 10;
        }

        return ans;
    }

    public static int sumOfInteger(int n) {
        int ans = 0;
        while (n > 0) {
            int digit = n % 10;
            ans += digit;
            n /= 10;
        }

        return ans;
    }
}
