package Search;

public class SplitArrayLargestSum410 {
    public int splitArray(int[] nums, int m) {
        int l = 0, r = 0;
        for (int i = 0; i < nums.length; i++) {
            l = Math.max(l, nums[i]);
            r += nums[i];
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (partition(nums, mid) <= m) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }

    private int partition(int[] nums, int x) {
        int count = 0, sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            // 分出一段，重置sum，并将i回退一步，累加count
            if (sum > x) {
                sum = 0;
                i--;
                count++;
            }
        }

        // 别忘了把最后一段加上去
        return count + 1;
    }
}
