package Linklist;

public class findHasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slowPtr = head, fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) { // 这里注意.next.next会报错
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr) {
                return true;
            }
        }
        return false;
    }
}
