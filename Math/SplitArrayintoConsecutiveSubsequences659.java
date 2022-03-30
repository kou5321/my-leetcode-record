package Math;

import java.util.HashMap;
import java.util.Map;

public class SplitArrayintoConsecutiveSubsequences659 {
    public boolean isPossible(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>(), end = new HashMap<>();
        // count number frequency
        for (int num : nums) count.put(num, count.getOrDefault(num, 0) + 1);
        // split
        for (int num : nums) {
            // if count = 0
            if (count.getOrDefault(num, 0) == 0) continue;
            count.put(num, count.get(num) - 1); // mind, cannot be ignored
            // if only can be continue
            if (end.containsKey(num - 1) && end.get(num - 1) > 0) {
                end.put(num - 1, end.get(num - 1) - 1);
                end.put(num, end.getOrDefault(num, 0) + 1);
                // if only can be start
            } else if (count.containsKey(num + 1) && count.get(num + 1) > 0
                    && count.containsKey(num + 2) && count.get(num + 2) > 0) {
                count.put(num + 1, count.get(num + 1) - 1);
                count.put(num + 2, count.get(num + 2) - 1);
                end.put(num + 2, end.getOrDefault(num + 2, 0) + 1);
            } else return false;
        }
        return true;
    }
}
