package Array;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray581 {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int[] cpy = new int[n];
        System.arraycopy(nums, 0, cpy, 0, n);
        Arrays.sort(cpy);
        int left = -1, right = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] != cpy[i]) {
                left = i;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] != cpy[i]) {
                right = i;
                break;
            }
        }
        return right == -1 ? 0 : right - left + 1;
    }
}
