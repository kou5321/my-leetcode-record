package String;

import java.util.LinkedList;
import java.util.List;

public class partitionLabels763 {
    public List<Integer> partitionLabels(String s) {
        int[] arr = new int[26];
        List<Integer> res = new LinkedList<>();
        for(int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a'] = i;
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, arr[s.charAt(i)-'a']);
            if (end == i) {
                res.add(end-start+1);
                start = end+1; // mind
            }
        }
        return res;
    }
}
