package 链表中倒数第k个结点;

public class Solution {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        if(pHead == null) return null;
        ListNode slow = pHead;
        ListNode fast = pHead;
        for (int i = 0; i < k; i++) {
            if(fast == null) return null;
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}

class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
        this.val = val;
    }
}