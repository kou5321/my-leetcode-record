package DynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

public class twoCityScheduling1029 {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) { // must public
                return o1[0]+o2[1]-o1[1]-o2[0];
            }
        });

        int total = 0;
        int n = costs.length / 2;
        // To optimize the company expenses,
        // send the first n persons to the city A
        // and the others to the city B
        for (int i = 0; i < n; ++i)
            total += costs[i][0] + costs[i + n][1];
        return total;
    }
}
