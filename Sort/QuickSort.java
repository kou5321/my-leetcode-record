package Sort;

public class QuickSort {
    public int[] sortArray(int[] nums) {
        return sort(nums, 0, nums.length-1);
    }

    public static int[] sort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end > array.length -1 ||start > end) {
            return null;
        }
        // 数据分割成独立的两个部分，从哪儿分区的指示器
        int zoneIndex = partition(array, start, end);
        if (zoneIndex > start) {
            sort(array, start, zoneIndex - 1);
        }
        if (zoneIndex < end) {
            sort(array, zoneIndex + 1, end);
        }
        return array;
    }

    /**
     * 快速排序的分区方法
     */
    public static int partition(int[] array, int start, int end) {
        // 只有一个元素，无需排序
        if (start == end) {
            return start;
        }
        // 随机选取一个随机数
        int pivot = (int) (start + Math.random() * (start - end + 1));
        // zoneIndex是分区指示器
        int zoneIndex = start - 1;
        // 基准数和分区尾元素交换位置
        swap(array, pivot, end);
        for (int i = start; i <= end; i++) {
            if (array[i] <= array[end]) {
                zoneIndex++;
                if (i > zoneIndex) {
                    swap(array, i, zoneIndex);
                }
            }
        }
        return zoneIndex;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
