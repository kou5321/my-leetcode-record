package ExhaustiveSearch;

import java.util.Arrays;

public class houseRobberII213 {
    private int[] memo1;
    private int[] memo2;

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        memo1 = new int [nums.length+1];
        memo2 = new int [nums.length+1];
        Arrays.fill(memo1, -1);
        Arrays.fill(memo2, -1);
        return Math.max(dp(nums, 0, nums.length-2, memo1), dp(nums, 1, nums.length-1, memo2));
    }

    int dp(int[] nums, int start, int end, int[] memo) {
        // base case
        if (start >= nums.length || end >= nums.length || start > end) { // >=
            return 0;
        }
        // memo
        if (memo[start] != -1) return memo[start];
        int res = Math.max(dp(nums, start+1, end, memo), nums[start]+dp(nums, start+2, end, memo));
        memo[start] = res;
        return res;
    }
}
