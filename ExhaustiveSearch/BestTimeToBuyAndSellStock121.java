package ExhaustiveSearch;

public class BestTimeToBuyAndSellStock121 {
    public static int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for (int i = 0; i < prices.length; i++) {
            if (i - 1 == -1) {
                // base case
                dp[i][0] = 0;
                dp[i][1] = -prices[i];
                continue; // mind
            }
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], -prices[i]); // don't use dp[i-1][0]
        }
        return dp[prices.length-1][0];
    }

    public static void main(String[] args) {
        int []arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
