package Sort;

public class QuickSort {
    public int sortArray(int[] nums) {
        return sort(nums, 0, nums.length-1);
    }

    public static int[] sort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end > array.length -1 ||start > end) {
            return null;
        }
        int zoneIndex = partition(array, start, end);
    }

    /**
     * 快速排序的分区方法
     */
    public static int partition(int[] array, int start, int end) {

    }
}
