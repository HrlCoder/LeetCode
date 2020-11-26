package 设计循环双端队列;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author： 浪漫不死
 * @Date： 2020/11/20
 * @description：
 * @version: 1.0
 */

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */

class Node {
    int val;
    Node prev;
    Node next;

    public Node(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

public class MyCircularDeque {

    int count;  //元素数量
    int capacity;   //容量
    Node head, tail;

    public MyCircularDeque(int k) {
        this.count = 0;
        this.capacity = k;
    }

    public boolean insertFront(int value) {
        if(count == capacity) {
            return false;
        }
        Node node = new Node(value);
        if(count == 0) {
            head = tail = node;
        } else {
            head.prev = node;
            node.next = head;
            head = head.prev;
        }
        count++;
        return true;
    }

    public boolean insertLast(int value) {
        if(count == capacity) {
            return false;
        }
        Node node = new Node(value);
        if(count == 0) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = tail.next;
        }
        count++;
        return true;
    }

    public boolean deleteFront() {
        if(count == 0) {
            return false;
        }
        if(count == 1) {
            head = tail = null;
        } else {
            Node newhead = head.next;
            head.next = null;
            head = newhead;
            head.prev = null;
        }
        count--;
        return true;
    }

    public boolean deleteLast() {
        if(count == 0) {
            return false;
        }
        if(count == 1) {
            head = tail = null;
        } else {
            Node newTail = tail.prev;
            tail.prev = null;
            tail = newTail;
            tail.next = null;
        }
        count--;
        return true;
    }

    public int getFront() {
        return count > 0 ? head.val : -1;
    }

    public int getRear() {
        return count > 0 ? tail.val : -1;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }
}
