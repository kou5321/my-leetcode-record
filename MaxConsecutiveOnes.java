public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
        public static int findMaxConsecutiveOnes(int[] nums) {
            int sum = 0, max = 0;
            for (int num : nums) {
                if (num == 1) {
                    sum++;
                } else {
                    max = Math.max(sum, max);
                    sum = 0;
                }
            }
            return Math.max(sum, max);
            // note that not max for when the last number is 1, it will not take "else" step
            // 不要返回 max
        }
}
