package 删除排序链表中的重复元素;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/11/6 10:00
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode cur = prev.next;
        while (cur != null) {
            if(cur.val == prev.val) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
