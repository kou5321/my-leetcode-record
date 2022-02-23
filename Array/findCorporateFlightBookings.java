package Array;

public class findCorporateFlightBookings {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] nums = new int[n];
        Difference df = new Difference(nums);

        for (int[] booking : bookings) {
            int i = booking[0] - 1;
            int j = booking[1] - 1;
            // 航班数是从1开始计数的
            int k = booking[2];
            df.increament(i, j, k);
        }

        return df.result();
    }

    class Difference {
        private int[] diff;

        public Difference(int[] nums) {
            assert nums.length > 0;
            diff = new int[nums.length];
            diff[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                diff[i] = nums[i-1] + diff[i-1];
            }
        }

        public void increament(int i, int j, int val) {
            diff[i] += val;
            if (j + 1 < diff.length) {
                diff[j+1] -= val;
            }
        }

        public int[] result() {
            int[] res = new int[diff.length];
            res[0] = diff[0];
            for (int i = 1; i < diff.length; i++) { // 注意这里i=1开始
                res[i] = res[i-1] + diff[i];
            }
            return res;
        }
    }
}
