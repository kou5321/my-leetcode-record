package Sort;

/**
 *  简单选择排序
 */
public class ChoiceSort {
    public int[] sortArray(int[] nums) {
        if (nums.length == 0) return nums;
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i; // 最小数的下标，每个循环开始总是假设第一个数最小
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            // 最小的数字为 nums[minIndex]
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
