package com.Himraj.Arrays;

// https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
public class IsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(pangram(sentence));
    }

    public static boolean pangram(String sentence) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        sentence = sentence.toLowerCase();
        for (char c : alphabet) {
            if (sentence.indexOf(c) == -1) return false;
        }

        return true;


    }
}
