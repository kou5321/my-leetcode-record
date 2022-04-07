package Queue;

import java.util.PriorityQueue;

public class LastStoneWeight1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            return b-a;
        });
        for (int i = 0; i < stones.length; i++) {
            pq.offer(stones[i]);
        }
        while (pq.size() > 1) {
            int big = pq.poll();
            int small = pq.poll();
            if (big == small) continue;
            else pq.offer(big - small);
        }
        return pq.size() == 0 ? 0 : pq.poll();
    }
}
