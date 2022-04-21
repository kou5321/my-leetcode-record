package DataStructureDesign;

import java.util.PriorityQueue;

public class FindMedianfromDataStream295 {
    private PriorityQueue<Integer> small;
    private PriorityQueue<Integer> large;

    public FindMedianfromDataStream295() {
        large = new PriorityQueue<>();
        small = new PriorityQueue<>((a, b) -> {
            return b - a;
        });
    }

    public void addNum(int num) {
        if (small.size() >= large.size()) {
            small.offer(num);
            large.offer(small.poll());
        } else {
            large.offer(num);
            small.offer(large.poll());
        }
    }

    public double findMedian() {
        if (small.size() > large.size()) {
            return small.peek();
        } else if (small.size() < large.size()) {
            return large.peek();
        } else {
            return (small.peek() + large.peek()) / 2.0; // mind
        }
    }
}
