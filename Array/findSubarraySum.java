package Array;

import java.util.HashMap;

public class findSubarraySum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> preSum = new HashMap<>();
        int n = nums.length;
        preSum.put(0, 1);
        int res = 0, sum0_i = 0;
        for (int i = 0; i < n; i++) {
            sum0_i += nums[i];
            int sum0_j = sum0_i - k;
            if (preSum.containsKey(sum0_j)) {
                res += preSum.get(sum0_j);
                // 注意这里不能直接res++
            }
            preSum.put(sum0_i, preSum.getOrDefault(sum0_i, 0) + 1);
            // 注意这里getOrDefault用法
        }
        return res;
    }
}
