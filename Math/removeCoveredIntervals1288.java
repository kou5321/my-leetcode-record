package Math;

import java.util.Arrays;

public class removeCoveredIntervals1288 {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if(a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });
        int left = intervals[0][0];
        int right = intervals[0][1];
        int res = intervals.length;
        for (int i = 1; i < intervals.length; i++) {
            int[] intv = intervals[i];
            // include
            if (left <= intv[0] && right >= intv[1]) {
                res--;
            }
            // intersect
            if (right <= intv[1] && right >= intv[0]) {
                right = intv[1];
            }
            // not intersect
            if (right < intv[0]) {
                left = intv[0];
                right = intv[1];
            }
        }
        return res;
    }
}
