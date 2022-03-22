package DynamicProgramming;

import java.util.Arrays;

public class MinimumPathSum64 {
    int[][] memo;

    public int minPathSum(int[][] grid) {
        memo = new int[grid.length][grid[0].length];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return dp(grid, grid.length-1, grid[0].length-1);
    }

    int dp(int[][] grid, int i, int j) {
        // base case
        if (i == 0 && j == 0) {
            return grid[0][0];
        }
        // exception
        if (i >= grid.length || j >= grid[0].length || i < 0 || j < 0) {
            return Integer.MAX_VALUE; // mind
        }
        // memo
        if (memo[i][j] != -1) return memo[i][j];
        // common case
        memo[i][j] = Math.min(dp(grid, i-1, j), dp(grid, i, j-1)) + grid[i][j];
        return memo[i][j];
    }
}
