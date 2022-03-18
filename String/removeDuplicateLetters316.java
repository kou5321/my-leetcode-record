package String;

import java.util.Stack;

public class removeDuplicateLetters316 {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        boolean[] inStack = new boolean[256];
        for (char c : s.toCharArray()) {
            count[c]--;
            if (inStack[c]) continue;
            while(!stack.isEmpty() && stack.peek() > c) {
                if (count[stack.peek()] == 0) {
                    break;
                }
                inStack[stack.pop()] = false;
            }
            inStack[c] = true;
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char m : stack) {
            sb.append(m);
        }
        return sb.toString();
    }
}
