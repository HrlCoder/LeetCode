package 栈.比较含退格的字符串;

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
    public boolean backspaceCompare(String S, String T) {
        //将两个字符串转换成char数组
        char[] c1 = S.toCharArray();
        char[] c2 = T.toCharArray();
        //创建两栈分开操作
        Stack<Character> s = new Stack<>();
        Stack<Character> s1 = new Stack<>();
        //遍历数组
        for (int i = 0; i < c1.length; i++) {
            //当栈顶元素为#时，弹出栈顶元素
            if(c1[i] == '#') {
               if(!s.isEmpty()) {
                   s.pop();
               }
            } else {
                s.push(c1[i]);
            }
        }

        for (int i = 0; i < c2.length; i++) {
            if(c2[i] == '#') {
                if(!s1.isEmpty()) {
                    s1.pop();
                }
            } else {
                s1.push(c2[i]);
            }
        }

        //两个栈的栈顶元素相同时，依次弹出栈顶元素。
        //不同时，说明字符串不相同，返回false
        while (!s.isEmpty() && !s1.isEmpty()) {
            if(s.peek() != s1.peek()) {
                return false;
            } else {
                s.pop();
                s1.pop();
            }
        }
        //当两个栈都为空的时候，说明最后返回的字符串相同
        return s.isEmpty() && s1.isEmpty();
    }
}