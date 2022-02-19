package Sort;

public class InsertSort {
    public int[] sortArray(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int currentValue; /* 当前待排序的数据，该元素之前的元素均已被排序过 */
        for (int i = 0; i < nums.length; i++) {
            int preIndex = i; // 已经被排序元素的索引
            currentValue = nums[preIndex + 1];
            while (preIndex >= 0 && currentValue < nums[preIndex]) {
                nums[preIndex + 1] = nums[preIndex];
                preIndex--;
            }
            // while循环结束说明已经找到了合适的位置
            nums[preIndex] = currentValue;
        }
        return nums;
    }
}
