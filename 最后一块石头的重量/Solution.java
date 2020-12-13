package 栈.最后一块石头的重量;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        Stack<Integer> d1 = new Stack<>();
        Stack<Integer> d2 = new Stack<>();
        Arrays.sort(stones);
        for (int stone : stones) {
            d1.push(stone);
        }

        while (d1.size() > 1) {
            int newStone = d1.pop() - d1.pop();
            while(d1.size() > 0 && d1.peek() > newStone) {
                d2.push(d1.pop());
            }
            d1.push(newStone);
            while (d2.size() > 0) {
                d1.push(d2.pop());
            }
        }
        if(!d1.isEmpty()) {
            return d1.pop();
        }
        return 0;
    }
}