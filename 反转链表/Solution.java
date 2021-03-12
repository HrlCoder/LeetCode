package 链表.反转链表;


public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null) {
            return null;
        }

        ListNode p1 = null;
        ListNode p2 = head;
        ListNode p3 = head.next;
        while (p2 != null) {
            p2.next = p1;
            p1 = p2;
            p2 = p3;
            if(p3 != null) {
                p3 = p3.next;
            }
        }
        return p1;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}