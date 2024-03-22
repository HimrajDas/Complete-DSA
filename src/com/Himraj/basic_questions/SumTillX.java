package com.Himraj.basic_questions;

import java.util.Scanner;

// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class SumTillX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true) {
            int number = input.nextInt();
            ans += number;

        }

    }
}
