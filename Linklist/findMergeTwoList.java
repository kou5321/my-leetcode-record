package Linklist;

public class findMergeTwoList {
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        while(list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                p.next = list2;
                list2 = list2.next;
            } else {
                p.next = list1;
                list1 = list1.next;
            }
            p = p.next;
        }
        if (list1 == null) {
            p.next = list2;
        }
        if (list2 == null) {
            p.next = list1;
        }
        return head.next;
    }
}
