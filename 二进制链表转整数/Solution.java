package 二进制链表转整数;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/11/5 16:46
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
 }
public class Solution {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        while (head != null) {
            //最重要步骤：二进制转十进制
            result = result*2 + head.val;
            head = head.next;
        }
        return result;
    }
}
