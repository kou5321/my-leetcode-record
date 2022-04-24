package Array;

import java.util.HashSet;
import java.util.Iterator;

public class IntersectionofTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.remove(num)) {
                set2.add(num);
            }
        }
        int[] res = new int[set2.size()];
        int i = 0;

        // for遍历
        // for (Integer integer : set2) {
        //     res[i] = integer;
        //     i++;
        // }
        // return res;

        // 迭代器遍历
        Iterator<Integer> it = set2.iterator();
        while (it.hasNext()) {
            res[i] = it.next();
            i++;
        }
        return res;
    }
}
