package com.Himraj.basic_questions;

import java.util.Scanner;

// Input a year and find whether it is a leap year or not.
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("It's a leap year.");
                } else {
                    System.out.println("It's not a leap year.");
                }
            } else {
                System.out.println("It's a leap year.");
            }
        } else {
            System.out.println("Not a leap year.");
        }

    }
}
