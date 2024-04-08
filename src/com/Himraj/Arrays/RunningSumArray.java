package com.Himraj.Arrays;

import java.util.Arrays;

// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.
public class RunningSumArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(cumulativeArray(arr)));
    }

    public static int[] cumulativeArray(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) ans[i] = arr[i];
            else ans[i] = arr[i] + ans[i - 1];
        }

        return ans;
    }
}
