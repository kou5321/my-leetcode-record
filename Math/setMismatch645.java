package Math;

import java.util.Arrays;

public class setMismatch645 {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+1];
        Arrays.fill(arr, 1);
        int dup = -1;
        int los = -1;
        for (int i = 0; i < n; i++) {
            arr[nums[i]]--;
        }
        for (int i = 1; i < n+1; i++) {
            if (arr[i] == 1) {
                los = i;
            } else if (arr[i] != 0) {
                dup = i;
            }
        }
        return new int[]{dup, los};
    }
}
