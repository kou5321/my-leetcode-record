package Array;

import java.util.HashMap;

public class findCheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> dict = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            int feq = dict.getOrDefault(s1.charAt(i), 0);
            dict.put(s1.charAt(i), feq + 1);
        }

        HashMap<Character, Integer> temp = new HashMap<>();
        int i = 0;
        for (int j = 0; j < s2.length(); j++) {
            if (!dict.containsKey(s2.charAt(j))) {
                i = j + 1;
                temp.clear(); //clear counter
                continue;
            }

            int count = temp.getOrDefault(s2.charAt(j), 0);
            if (count == 0 || count < dict.get(s2.charAt(j))) {
                temp.put(s2.charAt(j), count + 1);

                if (j - i + 1 == s1.length()) {
                    return true;
                }
            } else {
                while (i < j) {
                    if (s2.charAt(i) == s2.charAt(j)) {
                        i++;
                        break;
                    }

                    temp.put(s2.charAt(i), temp.get(s2.charAt(i)) - 1);
                    i++;
                }
            }
        }

        return false;
    }
}
