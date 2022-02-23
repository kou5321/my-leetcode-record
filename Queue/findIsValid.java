package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class findIsValid {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            }
            else if (c == '[') {
                stack.push(']');
            }
            else if (c == '{') {
                stack.push('}');
            }
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty(); // 注意返回不是直接返回true
    }
}
