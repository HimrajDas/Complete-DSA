package com.Himraj.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] ans = targetArray(nums, index);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] targetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) list.add(index[i], nums[i]);
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;

    }
}
