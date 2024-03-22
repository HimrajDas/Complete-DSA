package com.Himraj.basic_questions;

// You are allowed to go out with your friends only on the even days of a given month.
// Write a program to count the number of days you can go out in the month of August.
public class EvenDays {
    public static void main(String[] args) {
        int noOfEvenDays = 0;
        for (int i = 1; i <= 31; i++) {
            if (i % 2 == 0) noOfEvenDays += 1;
        }

        System.out.println("In August, I can go for " + noOfEvenDays + " days.");
    }
}
