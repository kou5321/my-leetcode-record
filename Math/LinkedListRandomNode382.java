package Math;

import java.util.Random;

public class LinkedListRandomNode382 {
    ListNode head;
    Random r = new Random();

    public Solution(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        int i = 0, res = 0;
        ListNode p = head;
        while (p != null) {
            i++;
            if (r.nextInt(i) == 0) {
                res = p.val;
            }
            p = p.next;
        }
        return res;
    }
}
