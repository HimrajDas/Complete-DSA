package com.Himraj.basic_questions;

import java.util.Scanner;

// To find out whether the given String is Palindrome or not.
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string you wanna check: ");
        String userInput = input.nextLine().toLowerCase();
        String rev = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            rev = rev + userInput.charAt(i);
        }

        if (userInput.equals(rev)) System.out.println("The string is palindrome.");
        else System.out.println("Not a palindrome string.");

    }
}
