import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum15 {
    static public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) // mind
                continue;
            if(nums[i] > 0) {
                break;
            }
            int left = i+1, right = nums.length-1;
            while(left < right) {
                int t = nums[left] + nums[right] + nums[i];
                if (t == 0) {
                    List<Integer> lst = new ArrayList<>();
                    lst.add(nums[left]);
                    lst.add(nums[i]);
                    lst.add(nums[right]);
                    list.add(lst);
                    while(left < right && nums[right] == nums[right - 1]) right--;
                    while(left < right && nums[left] == nums[left + 1]) left++;
                }
                if (t > 0) {
                    right --;
                }
                else {
                    left ++;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0};
        System.out.println(threeSum(arr));
    }
}
