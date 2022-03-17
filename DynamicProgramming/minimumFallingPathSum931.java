package DynamicProgramming;

import java.util.Arrays;

public class minimumFallingPathSum931 {
    int[][] memo;

    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int res = Integer.MAX_VALUE;
        memo = new int [n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], 66666);
        }
        for (int j = 0; j < n; j++) {
            res = Math.min(res, dp(matrix, n-1, j));
        }
        return res;
    }

    int dp (int[][] matrix, int i ,int j) {
        // Exception must be first
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) {
            return 99999;
        }
        // base case
        if (i == 0) {
            return matrix[0][j];
        }
        if (memo[i][j] != 66666) {
            return memo[i][j];
        }
        memo[i][j] = matrix[i][j] + min(dp(matrix, i-1, j-1),dp(matrix, i-1, j),dp(matrix, i-1, j+1)); // key
        return memo[i][j];
    }

    int min (int i, int j, int k) {
        return Math.min(i, Math.min(j, k));
    }
}
