package com.Himraj.Arrays;

import java.util.Arrays;

// Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and
// ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//Specifically, ans is the concatenation of two nums arrays.
//Return the array ans.
public class ConcatenationArray {
    public static void main(String[] args) {
        int[] numbs = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(numbs)));
    }

    public static int[] getConcatenation(int[] arr) {
        int n = arr.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[i];
            ans[i + n] = arr[i];
        }

        return ans;
    }

}
