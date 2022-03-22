package String;

import com.sun.jdi.Value;

import java.util.Arrays;

public class SmallestStringWithAGivenNumericValue1663 {
    public String getSmallestString(int n, int k) {
        int m = n;
        char[] minString = new char[n];
        Arrays.fill(minString, 'a');
        int i = 0;
        while ((n-1) * 26 + 1 >= k) {
            n--;
            k--;
            i++;
        }
        if (k % 26 == 0) {
            minString[i] = 'z'; // mind
        } else {
            minString[i] = (char)('a' + k % 26 - 1); // mind
        }
        for (int j = i + 1; j < m; j++) {
            minString[j] = 'z';
        }
        return new String(minString); // cannot toString()
    }
}
