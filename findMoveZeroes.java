import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;

//Given an integer array nums, move all 0's to the end of it while maintaining
//the relative order of the non-zero elements.
//
// Note that you must do this in-place without making a copy of the array.
//
//
// Example 1:
// Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
// Example 2:
// Input: nums = [0]
//Output: [0]
//
//
// Constraints:
//
//
// 1 <= nums.length <= 10⁴
// -2³¹ <= nums[i] <= 2³¹ - 1
//
//
//
//Follow up: Could you minimize the total number of operations done? Related
//Topics Array Two Pointers 👍 7902 👎 216
public class findMoveZeroes {
    // 第一种思路：将0不管，非零先排列，最后插入0
    // 第二种思路：冒泡排序，从前往后遍历一次，将0和非0前后交换
    //leetcode submit region begin(Prohibit modification and deletion)
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }
        public static int[] moveZeroes(int[] nums) {
            int pos = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[pos] = nums[i];
                    pos++;
                }
            }
            for (;pos < nums.length;pos++) {
                nums[pos] = 0;
            }
            return nums;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
