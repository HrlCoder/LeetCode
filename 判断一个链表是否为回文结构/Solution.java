package 判断一个链表是否为回文结构;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public boolean isPail (ListNode head) {
        if(head == null) return true;
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null) {
            stack.add(cur);
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            if(cur.val != stack.pop().val) {
                return false;
            }
            cur = cur.next;
        }
        return true;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}
