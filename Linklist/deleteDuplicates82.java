package Linklist;

public class deleteDuplicates82 {
    public ListNode deleteDuplicates82(ListNode head) {
        if (head == null) return null;
        ListNode h = new ListNode(-1);
        h.next = head;
        ListNode pre = h, cur = head;
        while (cur != null) {
            boolean isDul = false;
            while(cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
                isDul = true;
            }
            if (isDul == true) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return h.next;
    }
}
