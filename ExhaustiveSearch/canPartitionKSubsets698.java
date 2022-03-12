package ExhaustiveSearch;

public class canPartitionKSubsets698 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        // k = 0，true
        if (k > nums.length) return false;
        // 桶数目太多, false
        if (k == 0) return true;
        // 不能整除，false
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % k != 0) return false;
        int target = sum / k;
        boolean[] used = new boolean[nums.length];
        return backtrack(k, 0, nums, 0, used, target);
    }

    /**
     *
     * @param k k个桶
     * @param bucket 桶目前装的数量
     * @param nums 存储的原始数组
     * @param start 开始
     * @param used 是否被使用
     * @param target 目标容量
     * @return 能否成功被分开
     */

    public boolean backtrack(int k, int bucket, int[] nums, int start, boolean[] used, int target) {
        if (k == 0) return true;
        if (bucket == target) return backtrack(k - 1, 0, nums, 0, used, target);
        // 从 start 开始向后探查有效的 nums[i] 装⼊当前桶
        for (int i = start; i < nums.length; i++) {
            // 剪枝
            if (used[i]) {
                // nums[i] 已经被撞到其他桶
                continue;
            }
            if (nums[i] + bucket > target) {
                // 当前桶装不下 nums[i]
                continue;
            }
            // 做选择
            used[i] = true;
            bucket += nums[i];
            // 递归穷举下⼀个数字是否装⼊当前桶
            if (backtrack(k, bucket, nums, i+1, used, target)) {
                return true;
            }
            // 撤销
            used[i] = false;
            bucket -= nums[i];
        }
        // 穷举所有桶后仍然无法满足
        return false;
    }
}
