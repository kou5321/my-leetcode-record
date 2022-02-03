package iteration;

import java.util.HashMap;
import java.util.Map;

public class findClimbStairs {
    // AC but time limit exceeded
//    public int climbStairs(int n) {
//        if (n == 1) return 1;
//        if (n == 2) return 2;
//        return climbStairs(n-1) + climbStairs(n-2);
//    }
    private Map<Integer, Integer> storeMap = new HashMap<>();

    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (storeMap.get(n) != null)
            return storeMap.get(n);
        else {
            int result = climbStairs(n-1) + climbStairs(n-2);
            storeMap.put(n, result);
            return result;
        }
    }
}
