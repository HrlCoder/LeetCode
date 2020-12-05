package 从尾到头打印链表;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/11/5 16:59
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
public class Solution {
    public int[] reversePrint(ListNode head) {
        ListNode node = head;
        int count = 0;
        while (node != null) {
            ++count;
            node = node.next;
        }
        int[] nums = new int[count];
        node = head;
        for (int i = count - 1; i >= 0; --i) {
            nums[i] = node.val;
            node = node.next;
        }
        return nums;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode newHead = null;
        while (cur != null) {
            newHead = cur.next;
            cur.next = prev;
            prev = cur;
            cur = newHead;
        }
        return prev;
    }
}
