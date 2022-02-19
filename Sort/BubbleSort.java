package Sort;

public class BubbleSort {
    public int[] sortArrays(int[] nums) {
        if (nums.length == 0) return nums;
        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i -1; j++) {
                if (nums[j+1] < nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                PrintArray.print(nums);
            }
            System.out.println("---------------");
        }
        return nums;
    }


}
