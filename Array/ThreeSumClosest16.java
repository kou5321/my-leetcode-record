package Array;

import java.util.Arrays;

public class ThreeSumClosest16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int tmp_sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(tmp_sum - target) < diff) {
                    diff = Math.abs(tmp_sum - target);
                    result = tmp_sum;
                }
                if (tmp_sum >= target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}
