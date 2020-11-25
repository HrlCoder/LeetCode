package 设计链表;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/11/3 20:53
 */

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}

class MyLinkedList {
    int size;
    ListNode head;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        size=0;//随时记录链表长度
        head = new ListNode(0);
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index<0||index>=size) return -1;
        ListNode curr=head;
        for(int i=0;i<=index;i++) curr=curr.next;
        return curr.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size,val);//容易错写成size-1
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index>size) return;
        if(index<0) index=0;
        ListNode pred=head,toAdd=new ListNode(val);
        for(int i=0;i<index;i++) pred=pred.next;
        toAdd.next=pred.next;
        pred.next=toAdd;
        size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index<0||index>=size) return;
        ListNode pred=head;
        for(int i=0;i<index;i++) pred=pred.next;
        pred.next=pred.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */