package Linklist;

public class SwappingNodesinaLinkedList1721 {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode a = new ListNode();
        a.next = head;
        ListNode temp = a, back = a;
        for(int i = 0; i < k; i++) {
            temp = temp.next;
        }
        ListNode front = temp;
        while (temp != null) {
            temp = temp.next;
            back = back.next;
        }
        int tmp = back.val;
        back.val = front.val;
        front.val = tmp;
        return head;
    }
}
