package 移除重复节点;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/11/6 10:44
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
public class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            set.add(cur.val);
            if(set.contains(cur.next.val)) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
