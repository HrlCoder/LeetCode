package 栈的弹出压入序列;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author： 浪漫不死
 * @Date： 2020/11/20
 * @description：
 * @version: 1.0
 */
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        //判断两个序列的合理性
        if(pushA.length == 0 || popA.length == 0 || pushA.length != popA.length) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        //遍历入栈序列，进行入栈
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            //判断出栈序列的栈顶元素是否等于入栈序列的栈顶元素
            while (!stack.isEmpty() && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
