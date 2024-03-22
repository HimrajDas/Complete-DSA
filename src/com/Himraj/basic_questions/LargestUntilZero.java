package com.Himraj.basic_questions;

import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the largest number from all.
public class LargestUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        boolean flag = true;
        int ans = 0;
        while (flag) {
            int n = sc.nextInt();
            if (n > ans) ans = n;
            if (n == 0) flag = false;
        }

        System.out.println(ans);

    }
}
