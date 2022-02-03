package Array;

import java.util.HashMap;
import java.util.Map;

public class findTwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> storeNum = new HashMap<>(nums.length, 1); // 没有private
            int[] result = new int[2]; // int[]
            for (int i = 0; i < nums.length; i++) {
                Integer another = storeNum.get(target - nums[i]);
                if (another != null) {
                    result[0] = another;
                    result[1] = i; // 不要弄错顺序
                    break;
                } else {
                    storeNum.put(nums[i], i); // 不要忽略下标
                }
            }
            return result;
        }
    }
}
