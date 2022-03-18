package DynamicProgramming;

import java.util.Arrays;

public class deleteOperationForTwoString583 {
    int[][] memo;

    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        memo = new int[m][n];
        // init
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return word1.length() + word2.length() - 2 * dp(word1, 0, word2, 0);
    }

    int dp (String s1, int i, String s2, int j) {
        // base case
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }
        // check memo
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        // dp
        if (s1.charAt(i) == s2.charAt(j)) {
            memo[i][j] = 1 + dp(s1, i+1, s2, j+1);
        } else {
            memo[i][j] = Math.max(dp(s1, i+1, s2, j), dp(s1, i, s2, j+1));
        }
        return memo[i][j];
    }
}
