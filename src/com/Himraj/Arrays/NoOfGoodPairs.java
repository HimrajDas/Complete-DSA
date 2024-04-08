package com.Himraj.Arrays;

// https://leetcode.com/problems/number-of-good-pairs/description/
public class NoOfGoodPairs {
    public static void main(String[] args) {
        int[] numbs = {1, 2, 3, 1, 1, 3};
        System.out.println(goodPairs(numbs));
    }

    public static int goodPairs(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) ans++;
            }
        }

        return ans;
    }
}
