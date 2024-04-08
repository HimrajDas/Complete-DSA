package com.Himraj.Arrays;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2};
        System.out.println(Arrays.toString(shuffleArray(arr, 2)));
    }

    public static int[] shuffleArray(int[] arr, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = arr[i];
            ans[2 * i + 1] = arr[n + i];
        }

        return ans;
    }
}
