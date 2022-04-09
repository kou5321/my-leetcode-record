package Queue;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            return map.get(a) - map.get(b); // key
        });
        for (Integer key : map.keySet()) {
            if (pq.size() < k) {
                pq.offer(key);
            } else {
                if (map.get(key) > map.get(pq.peek())) {
                    pq.poll();
                    pq.offer(key);
                }
            }
        }
        int[] res = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            res[i] = pq.poll();
            i++;
        }
        return res;
    }
}
