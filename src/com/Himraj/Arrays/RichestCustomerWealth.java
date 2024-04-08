package com.Himraj.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] numbs = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(richestCustomer(numbs));
    }

    public static int richestCustomer(int[][] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum > ans) ans = sum;
        }

        return ans;
    }
}
