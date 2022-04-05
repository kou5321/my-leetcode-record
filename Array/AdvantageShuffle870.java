package Array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class AdvantageShuffle870 {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        // decrease
        PriorityQueue<int[]> maxpq = new PriorityQueue<>(
                (int[] pair1, int[] pair2) -> {
                    return pair2[1] - pair1[1];
                }
        );
        for (int i = 0; i < n; i++) maxpq.offer(new int[]{i, nums2[i]});
        // increase
        Arrays.sort(nums1);
        int left = 0, right = n - 1;
        int[] res = new int[n];
        for (int j = 0; j < n; j++) {
            int[] pair = maxpq.poll();
            int i = pair[0], maxval = pair[1];
            if (maxval < nums1[right]) {
                res[i] = nums1[right];
                right--;
            } else {
                res[i] = nums1[left];
                left++;
            }
        }
        return res;
    }
}
