import java.util.Arrays;

public class ThreeSumWithMultiplicity923 {
    public static int threeSumMulti(int[] arr, int target) {
        int res = 0;
        Arrays.sort(arr);
        int m = 1000000000 + 7;
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1, right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right]; // here
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else if (arr[left] != arr[right]) {
                    int count_left = 1, count_right = 1;
                    while (arr[left] == arr[left+1]) {
                        count_left++;
                        left++;
                    }
                    while (arr[right] == arr[right-1]) {
                        count_right++;
                        right--;
                    }
                    res += count_left * count_right;
                    res %= m;
                    left++;
                    right--;
                } else {
                    res += (right - left + 1) * (right - left) / 2;
                    res %= m;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5};
        int target = 8;
        System.out.println(threeSumMulti(arr, target));
    }
}
