package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            int feq = need.getOrDefault(p.charAt(i), 0);
            need.put(p.charAt(i), feq + 1);
        }
        int left = 0, right = 0, valid = 0;
        while (right < s.length()) {
            char c = s.charAt(right);

            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }

            while (right - left + 1 == p.length()) {//因为排列必须连续，不能中途有断：所以结束扩充的条件是窗口长度等于目标的长度；这一步相当于找可行解
                if (valid == need.size()) {//这一步相当于更加细化，开始在可行解里找最优解；
                    ans.add(left);
                }
                char d = s.charAt(left);
                left++;//这里是++
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {//是get哦
                        valid--;
                    }
                    window.put(d, window.getOrDefault(d, 0) - 1);
                }
            }
            right++;//right要写在后面，不然结果有问题
        }
        return ans;
    }
}
