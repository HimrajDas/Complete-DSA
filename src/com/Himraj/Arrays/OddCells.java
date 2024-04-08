package com.Himraj.Arrays;

// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
public class OddCells {
    public static void main(String[] args) {
        int[][] indices = {
                {1, 1},
                {0, 0}
        };

        System.out.println(oddCells(2, 2, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int ans = 0;
        // indices = [[0, 1], [1, 1]]
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            for (int j = 0; j < matrix[row].length; j++) {
                matrix[row][j]++;
            }
        }

        for (int i = 0; i < indices.length; i++) {
            int col = indices[i][1];

            for (int j = 0; j < m; j++) {
                matrix[j][col]++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) ans += 1;
            }
        }

        return ans;

    }
}
