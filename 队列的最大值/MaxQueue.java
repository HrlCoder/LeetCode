package 队列的最大值;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class MaxQueue {
    private Deque<Integer> queue;
    private Deque<Integer> help;
    public MaxQueue() {
        queue = new LinkedList<>();
        help = new LinkedList<>();
    }

    public int max_value() {
        if(queue.isEmpty()) {
            return -1;
        } else {
            return help.peek();
        }
    }

    public void push_back(int value) {
        queue.offer(value);
        while (!help.isEmpty() && value > help.peekLast()) {
            help.pollLast();
        }
        help.offer(value);
    }

    public int pop_front() {
        if(queue.isEmpty()) {
            return -1;
        }
        int val = queue.pop();
        if(help.peek() == val) {
            help.pop();
        }
        return val;
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */