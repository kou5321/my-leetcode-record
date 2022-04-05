package Array;

import java.util.LinkedList;
import java.util.List;

public class IntervalListIntersections986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> res = new LinkedList<>(); // int[]
        int i = 0, j = 0;
        while (i < firstList.length && j < secondList.length) { // &&
            int a0 = firstList[i][0], a1 = firstList[i][1];
            int b0 = secondList[j][0], b1 = secondList[j][1];
            if (a1 >= b0 && b1 >= a0) {
                res.add(new int[] {Math.max(a0, b0), Math.min(a1, b1)});
            }
            if (b1 < a1) j++;
            else i++;
        }
        return res.toArray(new int [0][0]);
    }
}
