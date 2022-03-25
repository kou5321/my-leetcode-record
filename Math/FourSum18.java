package Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) // mind
                continue;
            for (int j = i + 1; j < nums.length; j++) {
                if(j > i+1 && nums[j] == nums[j-1]) // mind
                    continue;
                int left = j+1, right = nums.length-1;
                while(left < right) {
                    int t = nums[left] + nums[right] + nums[j] + nums[i];
                    if (t == target) {
                        List<Integer> lst = new ArrayList<>();
                        lst.add(nums[left]);
                        lst.add(nums[i]);
                        lst.add(nums[right]);
                        lst.add(nums[j]);
                        list.add(lst);
                        while(left < right && nums[right] == nums[right - 1]) right--;
                        while(left < right && nums[left] == nums[left + 1]) left++;
                    }
                    if (t > target) {
                        right --;
                    }
                    else {
                        left ++;
                    }
                }
            }
        }
        return list;
    }
}
