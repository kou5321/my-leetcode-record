package Sort;

public class ShellSort {
    public int[] sortArray(int[] nums) {
        int len = nums.length;
        // 按照增量分组以后，每个分组中，temp代表当时待排序的数组，该元素之前的组内元素已经被排序过
        // gap指增量
        int currentValue, gap = len/2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                currentValue = nums[i];
                // 组内已经被排序的索引
                int preIndex = i - gap;
                // 组内已经被排序数据寻找合适的位置，如果小就后移
                while (preIndex >= 0 && nums[preIndex] > currentValue) {
                    nums[preIndex + gap] = nums[preIndex];
                    preIndex -= gap;
                }
                nums[preIndex + gap] = currentValue;
            }
            gap /= 2;
        }
        // while循环结束说明已经找到待排序的数据的合适位置，插入
    }
}
