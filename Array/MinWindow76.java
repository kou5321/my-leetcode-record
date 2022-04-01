package Array;

import java.util.HashMap;

public class MinWindow76 {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> goal = new HashMap<>();
        int goalSize = t.length();
        int minLen = Integer.MAX_VALUE;
        String result = "";

        // target dictionary
        for (int k = 0; k < t.length(); k++) {
            goal.put(t.charAt(k), goal.getOrDefault(t.charAt(k), 0) + 1);
        }
        // start
        int i = 0;
        int total = 0;
        // current dictionary
        HashMap<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < s.length(); j++) {
            // current character
            char c = s.charAt(j);
            if (!goal.containsKey(c)) {
                continue;
            }
            // if c is a target character, and count is less than goal, increase the total
            int count = map.getOrDefault(c, 0);
            if (count < goal.get(c)) {
                total++;
            }
            map.put(c, count+1);

            // when total reaches the goal, trim form the left
            if (total == goalSize) {
                while (!goal.containsKey(s.charAt(i)) || map.get(s.charAt(i)) > goal.get(s.charAt(i))) {
                    char pc = s.charAt(i);
                    if (goal.containsKey(pc) && map.get(pc) > goal.get(pc)) {
                        map.put(pc, map.get(pc) - 1);
                    }
                    i++;
                }

                if (minLen > j-i+1) {
                    minLen = j-i+1;
                    result = s.substring(i, j+1);
                }
            }
        }
        return result;
    }
}
