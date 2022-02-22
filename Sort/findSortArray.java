package Sort;

public class findSortArray {
    public int[] sortArray(int[] nums) {
        if(null==nums||0==nums.length){
            return nums;
        }
        quickSort(nums,0,nums.length-1);
        return nums;
    }

    private void quickSort(int[] nums ,int left,int right){
        if(left>=right){
            return;
        }
        int target = partition(nums,left,right);
        quickSort(nums,left,target-1);
        quickSort(nums,target+1,right);
    }

    private int partition(int[] nums,int left,int right){
        if (left == right) {
            return left;
        }
        int pivot = (int) (left + Math.random() * (right - left + 1));
        int zoneIndex = left - 1;
        swap(nums, pivot, right);
        for (int i = left; i <= right; i++) {
            if (nums[i] <= nums[right]) {
                zoneIndex++;
                if(i > zoneIndex) {
                    swap(nums, i, zoneIndex);
                }
            }
        }
        return zoneIndex;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
