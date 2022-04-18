import java.util.Stack;

public class LongestValidParentheses32 {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        int[] dp = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stk.push(i);
                dp[i + 1] = 0;
            } else {
                // 遇到右括号
                if (!stk.isEmpty()) {
                    int leftIndex = stk.pop();
                    int len = i - leftIndex + 1 + dp[leftIndex];
                    dp[i + 1] = len;
                } else {
                    // 没有匹配的左括号
                    dp[i + 1] = 0;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }


    public static void main(String[] args) {
        String s = ")()())";
        System.out.println(longestValidParentheses(s));
    }
}
