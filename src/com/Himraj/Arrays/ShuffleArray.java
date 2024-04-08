package com.Himraj.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};
    }

    public static int[] shuffle(int[] arr, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = arr[i];
            ans[2 * i + 1] = arr[n + i];
        }

        return ans;
    }
}
