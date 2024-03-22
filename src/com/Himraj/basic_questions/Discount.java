package com.Himraj.basic_questions;

import java.util.Scanner;

// Calculate Discount Of Product.
public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price: ");
        float originalPrice = input.nextFloat();
        System.out.print("Enter discount amount: ");
        float off = input.nextFloat();
        float discount = originalPrice * (off / 100);
        float finalPrice = originalPrice - discount;
        System.out.println("The final price: " + finalPrice);
    }
}
