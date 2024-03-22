package com.Himraj.basic_questions;

import java.util.Scanner;

// To find Armstrong Number between two given number.
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user inputs.
        System.out.print("Enter range1: ");
        int range1 = input.nextInt();
        System.out.print("Enter range2: ");
        int range2 = input.nextInt();

        System.out.println("Armstrong numbers between " + range1 + " and " + range2 + " are: ");
        for (int num = range1; num <= range2; num++) {
            if (isArmstrong(num)) System.out.println(num);
        }

    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int power = String.valueOf(num).length();
        int ans = 0;
         while (num != 0) {
             int lastDigit = num % 10;
             ans += Math.pow(lastDigit, power);
             num /= 10;
         }

         return ans == originalNum;
    }
}
