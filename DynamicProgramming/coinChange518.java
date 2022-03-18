package DynamicProgramming;

public class coinChange518 {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[coins.length+1][amount+1]; // mind
        // base case
        for (int i = 0; i <= coins.length ; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) { // mind the start
                if (j - coins[i-1] >= 0) {
                    dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]]; // key
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][amount];
    }
}
