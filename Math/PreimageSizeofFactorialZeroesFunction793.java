public class PreimageSizeofFactorialZeroesFunction793 {
    static public int preimageSizeFZF(int k) {
        return (int) (rightBound(k) - leftBound(k) + 1);
    }

    static long rightBound(int target) {
        long left = 0, right = Long.MAX_VALUE;
        while (left <= right) {
            long mid = (right - left) / 2 + left;
            if (target == countZero(mid)) {
                left = mid + 1;
            } else if (target > countZero(mid)) {
                left = mid + 1;
            } else if (target < countZero(mid)) {
                right = mid - 1;
            }
        }
        return right;
    }

    static long leftBound(int target) {
        long left = 0, right = Long.MAX_VALUE;
        while (left <= right) {
            long mid = (right - left) / 2 + left;
            if (target == countZero(mid)) {
                right = mid - 1;
            } else if (target > countZero(mid)) {
                left = mid + 1;
            } else if (target < countZero(mid)) {
                right = mid - 1;
            }
        }
        return left;
    }

    static long countZero(long k) {
        long res = 0;
        for (long i = 5; i <= k; i *= 5) {
            res += (k/i);
        }
        return res;
    }

    public static void main(String[] args) {
        int m = preimageSizeFZF(5);
        System.out.println(m);
    }
}
