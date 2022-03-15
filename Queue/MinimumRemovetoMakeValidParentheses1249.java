package Queue;

public class MinimumRemovetoMakeValidParentheses1249 {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') left++;
            if (c == ')') {
                if (left == 0) continue;
                else left--;
            }
            sb.append(c);
        }

        StringBuilder res = new StringBuilder();
        int right = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            // 注意 .length()
            if (sb.charAt(i) == ')') right++;
            if (sb.charAt(i) == '(') {
                if (right == 0) continue;
                else right--;
            }
            res.append(sb.charAt(i));
        }
        return res.reverse().toString();
    }
}
