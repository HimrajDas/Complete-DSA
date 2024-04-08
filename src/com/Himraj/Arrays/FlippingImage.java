package com.Himraj.Arrays;

import java.util.Arrays;

// https://leetcode.com/problems/flipping-an-image/description/
public class FlippingImage {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        System.out.println(Arrays.deepToString(flipImage(arr)));
    }

    public static int[][] flipImage(int[][] image) {
        inverseArray(image);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) image[i][j] = 1;
                else image[i][j] = 0;
            }
        }

        return image;
    }


    public static void inverseArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[i].length - 1;

            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;

                start++;
                end--;
            }
        }
    }


}
