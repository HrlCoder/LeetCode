package 链表.链式A加B;

public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        //当其中一个为空时，返回另一个
        if(a == null) {
            return b;
        }
        if(b == null) {
            return a;
        }

        //双指针
        ListNode p1 = a,p2 = b;
        //傀儡头结点
        ListNode fakeHead = new ListNode(-1);
        //傀儡指针
        ListNode p = fakeHead;

        int sum = 0;
        while (p1 != null || p2 != null || sum != 0) {
            if(p1 != null) {
                sum += p1.val;
                p1 = p1.next;
            }
            if(p2 != null) {
                sum += p2.val;
                p2 = p2.next;
            }

            p.next = new ListNode(sum % 10);
            sum /= 10;
            p = p.next;
        }
        return fakeHead.next;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}