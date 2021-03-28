package 合并两个有序链表;

public class Solution {
    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        ListNode faker = new ListNode(0);
        ListNode cur = faker;
        while (l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if(l1 != null) {
            cur.next = l1;
        }
        if(l2 != null) {
            cur.next = l2;
        }
        return faker.next;
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}