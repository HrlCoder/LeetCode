package 单链表的排序;

import java.util.ArrayList;

public class Solution {
    public ListNode sortInList (ListNode head){
        if(head == null || head.next == null)
            return head;

        ArrayList<Integer> space = new ArrayList<>();
        for (ListNode walker = head;walker!=null;walker = walker.next)
            space.add(walker.val);
        space.sort(Integer::compareTo);

        int i=0;
        for (ListNode walker = head;walker!=null;walker = walker.next)
        {
            walker.val = space.get(i++);
        }

        return head;
    }
}

class ListNode {
  int val;
  ListNode next = null;

}
