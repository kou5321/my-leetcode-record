package Queue;

import java.util.Stack;

public class ScoreofParenttheses856 {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(char c : s.toCharArray()) {
            int val = 0;
            if (c == '(') {
                stack.push(0);
            }
            else {
                int tmp = stack.pop();
                if (tmp > 0) {
                    val = 2 * tmp;
                } else {
                    val = 1;
                }
            }
            stack.push(stack.pop() + val);
        }
        return stack.peek();
    }
}
