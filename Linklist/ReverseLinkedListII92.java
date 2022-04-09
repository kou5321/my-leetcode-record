package Linklist;

public class ReverseLinkedListII92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy, cur = head;
        for (int i = 1; i < left; i++) {
            pre = pre.next;
        }
        cur = pre.next;
        for (int i = left; i < right; i++) {
            ListNode tmp = cur.next;
            cur.next = tmp.next;
            tmp.next = pre.next;
            pre.next = tmp;
        }
        return dummy.next;
    }
}
