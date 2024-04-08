package com.Himraj.Arrays;

// https://leetcode.com/problems/find-the-highest-altitude/description/

public class HighestAltitude {
    public static void main(String[] args) {
        int[] arr = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }

    public static int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length + 1];
        altitudes[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            altitudes[i + 1] = altitudes[i] + gain[i];
        }

        return largerNumber(altitudes);

    }

    public static int largerNumber(int[] list) {
        int ans = 0;
        for (int j : list) {
            if (j > ans) ans = j;
        }

        return ans;
    }
}
