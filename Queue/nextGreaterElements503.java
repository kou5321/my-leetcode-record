package Queue;

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElements503 {
    Stack<Integer> stack = new Stack<>();
    int[] ret = new int[nums.length];
        Arrays.fill(ret, -1);
    int len = nums.length;
        for(int i = 0; i < 2 * len; i++) {
        int num = nums[i % len];
        while(!stack.isEmpty() && num > nums[stack.peek()]) {
            ret[stack.pop()] = num;
        }
        if (i < len) stack.push(i);
    }
        return ret;
}
