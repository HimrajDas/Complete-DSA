package com.Himraj.basic_questions;

import java.util.Scanner;

// Input currency in rupees and output in USD.
public class RupeesToUSD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rupees: ");
        float rupees = scanner.nextFloat();
        float toUSD = (float) (rupees * 0.012);
        System.out.println("USD: " + toUSD);
    }
}
