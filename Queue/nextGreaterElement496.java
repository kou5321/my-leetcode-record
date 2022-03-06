package Queue;

import java.util.HashMap;
import java.util.Stack;

public class nextGreaterElement496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] ret = new int[nums1.length];

        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            if (map.get(nums1[i]) != null) {
                ret[i] = map.get(nums1[i]);
            } else {
                ret[i] = -1;
            }
        }
        return ret;
    }
}
