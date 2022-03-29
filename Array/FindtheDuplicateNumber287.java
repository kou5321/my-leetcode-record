package Array;

public class FindtheDuplicateNumber287 {
    class Solution {
        public int findDuplicate(int[] nums) {
            int n = nums.length;
            int start = 1;
            int end = n - 1;//因为数组中有一个数重复了一次，减去重复的这一个就是数组最大值。

            while(start < end){
                int mid = start + (end - start) / 2;
                int count = 0;

                for(int i = 0; i < n; i++){
                    if(nums[i] <= mid){
                        count++;//记录数组中比小于等于中位数的值
                    }
                }

                if(count > mid){
                    end = mid;//计数大于中位数，就让中位数当做有重复区域的最大值
                }else{
                    start = mid + 1;//不小于，说明前面的1~mid没问题，就让后面的一为作为最小值。
                }
            }
            return start;
        }
    }
}
