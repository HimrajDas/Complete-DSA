package com.Himraj.Arrays;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
public class KidsWithCandies {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> ans = candies(arr, extraCandies);
        System.out.println(ans);
    }

    public static List<Boolean> candies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int maxValue = 0;
        for (int i : candies) {
            if (i > maxValue) maxValue = i;
        }

        for (int i : candies) {
            if (i + extraCandies >= maxValue) {
                ans.add(true);
            } else ans.add(false);
        }

        return ans;
    }
}
