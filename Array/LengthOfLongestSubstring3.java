package Array;

import java.util.HashMap;

public class LengthOfLongestSubstring3 {
    public static void main(String[] args) {
        String s = "aabb";
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> window = new HashMap<>();
        // 记录字母，数组索引
        int left = 0, right = 0;
        int res = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (window.containsKey(c)) {
                left = Math.max(left, window.get(c) + 1);
                // left = window.get(c) + 1;
            }
            window.put(s.charAt(right), right);
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
}
