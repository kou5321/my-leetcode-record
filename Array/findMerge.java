package Array;

public class findMerge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n;
        for (int index = k-1, nums1Index = m - 1, nums2Index = n -1; index >= 0; index--) {
            if (nums1Index < 0) {
                nums1[index] = nums2[nums2Index--];
            }
            else if (nums2Index < 0) {
                break;
            }
            else if (nums1[nums1Index] > nums2[nums2Index]) {
                nums1[index] = nums1[nums1Index--];
            }
            else {
                nums1[index] = nums2[nums2Index--];
            }
        }
    }
}
