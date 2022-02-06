package Linklist;

public class findGetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int L1 = 0, L2 = 0, diff = 0;
        ListNode head1 = headA, head2 = headB;
        while (head1 != null) {
            L1++;
            head1 = head1.next;
        }
        while (head2 != null) {
            L2++;
            head2 = head2.next;
        }
        if (L1 < L2) {
            head1 = headB;
            head2 = headA;
            diff = L2 - L1;
        } else {
            head1 = headA;
            head2 = headB;
            diff = L1 - L2;
        }
        for (int i = 0; i < diff; i++) {
            head1 = head1.next;
        }
        while (head1 != null && head2 != null) {
            if (head1 == head2) return head1;
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
    }
}
