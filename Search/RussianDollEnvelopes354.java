package Search;

import java.util.Arrays;

public class RussianDollEnvelopes354 {
    public int maxEnvelopes(int[][] envelopes) {
        int len = envelopes.length;
        if (len < 2) {
            return len;
        }
        Arrays.sort(envelopes, (a, b)->a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);

        int[] tail = new int[len];
        tail[0] = envelopes[0][1];
        // end 表示有序数组 tail 的最后一个已经赋值元素的索引
        int end = 0;

        for (int i = 1; i < len; i++) {
            int target = envelopes[i][1];

            if (target > tail[end]) {
                end++;
                tail[end] = target;
            } else {
                int left = 0;
                int right = end;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (tail[mid] == target) {
                        left = mid;
                        break;
                    }
                    if (tail[mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                tail[left] = target;
            }
        }
        return end + 1;
    }
}
