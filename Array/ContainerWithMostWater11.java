package Array;

public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int res = 0;
        while (left <= right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            res = Math.max(res, area);
            if (height[left] >= height[right]) right --;
            else left++;
        }
        return res;
    }
}
