package com.Himraj.Arrays;

import java.util.Arrays;

// Given a zero-based permutation nums (0-indexed),
// build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
// A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
public class BuildArray {
    public static void main(String[] args) {
        int[] numbs = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(numbs)));
        // 0,1,2,4,5,3
    }

    public static int[] buildArray(int[] arr) {
        int arrLength = arr.length;
        int[] ans = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            ans[i] = arr[arr[i]];
        }

        return ans;
    }


}
