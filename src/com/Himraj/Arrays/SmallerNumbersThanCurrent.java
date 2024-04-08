package com.Himraj.Arrays;

import java.util.Arrays;

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] numbs = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbs(numbs)));
    }

    public static int[] smallerNumbs(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = 0;
            for (int j = 0; j < arr.length; j++) {
                if ((arr[j] < arr[i]) && (j != i)) ans[i]++;
            }
        }

        return ans;
    }

}
