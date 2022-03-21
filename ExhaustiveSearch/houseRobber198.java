package ExhaustiveSearch;

import java.util.Arrays;

public class houseRobber198 {
    private int[] memo;

    public int rob(int[] nums) {
        memo = new int [nums.length+1];
        Arrays.fill(memo, -1);
        return dp(nums, 0);
    }

    int dp(int[] nums, int start) {
        // base case
        if (start >= nums.length) { // >=
            return 0;
        }
        // memo
        if (memo[start] != -1) return memo[start];
        int res = Math.max(dp(nums, start+1), nums[start]+dp(nums, start+2));
        memo[start] = res;
        return res;
    }
}
