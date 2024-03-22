package com.Himraj.basic_questions;

import java.util.Scanner;

// Take 2 numbers as inputs and find their HCF and LCM.
public class HcfAndLcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = input.nextInt();
        System.out.print("enter b: ");
        int b = input.nextInt();
        int originalA = a;
        int originalB = b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("HCF of " + originalA + " and " + originalB + " is " + a);
        System.out.println("LCM of " + originalA + " and " + originalB + " is " + (originalA * originalB) / a);
    }
}
