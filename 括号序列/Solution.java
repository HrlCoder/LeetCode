package 括号序列;
import java.util.*;

public class Solution {
    public static boolean isValid (String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if(c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                } else {
                    if((c == ']' && stack.peek() == '[') ||
                            (c == ')' && stack.peek() == '(') ||
                            (c == '}' && stack.peek() == '{')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}
