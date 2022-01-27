package Linklist;

public class removeLinklist {
    public static void main(String[] args) {
        ListNode head = new ListNode(6);
        int val = 7;
        System.out.println(removeElements(head, val));
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

//Given the head of a linked list and an integer val, remove all the nodes of
//the linked list that has Node.val == val, and return the new head.
//
//
// Example 1:
//
//
//Input: head = [1,2,6,3,4,5,6], val = 6
//Output: [1,2,3,4,5]
//
//
// Example 2:
//
//
//Input: head = [], val = 1
//Output: []
//
//
// Example 3:
//
//
//Input: head = [7,7,7,7], val = 7
//Output: []
//
//
//
// Constraints:
//
//
// The number of nodes in the list is in the range [0, 10⁴].
// 1 <= Node.val <= 50
// 0 <= val <= 50
//
// Related Topics Linked List Recursion 👍 4332 👎 154


//leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    // 这道题需要注意链表的删除需要建立一个指针pre，可以创建一个pre跟着cur动，也可以做一个伪头指针用pre.next代替cur
    // 最厉害的方法是递归！
    // https://blog.csdn.net/zsy112371/article/details/52433451 里面有博主总结的三种方法
        public ListNode removeElements(ListNode head, int val) {
            ListNode fakeHead = new ListNode(-1);
            fakeHead.next = head;
            ListNode pre = fakeHead;
            while(pre.next != null) {
                if(pre.next.val == val) {
                    pre.next = pre.next.next;
                }
                else {
                    pre = pre.next;
                }
            }
            return fakeHead.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
