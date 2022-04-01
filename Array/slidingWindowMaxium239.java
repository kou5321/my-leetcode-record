package Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class slidingWindowMaxium239 {
    static class MonotonicQueue {
        LinkedList<Integer> q = new LinkedList<>();

        public void push(int n) {
            while (!q.isEmpty() && q.getLast() < n) {
                q.pollLast();
            }
            q.addLast(n);
        }

        public int max() {
            return q.getFirst();
        }

        public void pop(int n) {
            if (n == q.getFirst()) {
                q.pollFirst();
            }
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        MonotonicQueue window = new MonotonicQueue();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i < k - 1) {
                window.push(nums[i]);
            } else {
                window.push(nums[i]);
                res.add(window.max());
                window.pop(nums[i-k+1]); // i-k+1, keep it k-1 size(base case)
            }
        }
        int[] result = new int[res.size()]; // size
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
