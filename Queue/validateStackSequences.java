package Queue;

import java.util.Stack;

public class validateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length == 0 || popped.length == 0 || pushed.length != popped.length) {
            return false;
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0, j = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
