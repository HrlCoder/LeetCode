package 删除倒数第N个节点;

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}


public class Solution {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for(int i = 0; i < n; i++) {
            fast = fast.next;
        }
        //如果n的值等于链表的长度,直接返回去掉头结点的链表
        if(fast == null) {
            return head.next;
        }
        while(fast.next != null)   //同时移动两个指针
        {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
