package 表达式求值;

import java.util.Stack;

public class Solution {
    public int solve (String s) {
        // write code here
        char[] chars = s.toCharArray();
        int n = chars.length;
        // num记录上一个操作数
        int num = 0;
        // sign记录上一个运算符
        char sign = '+';
        Stack<Integer> stack = new Stack();
        for(int i=0;i<n;i++){
            //递归处理括号内字串
            if(chars[i] == '('){
                int parCount = 1;
                int j=i+1;
                while(parCount != 0){
                    if(chars[j] == '('){
                        parCount++;
                    }
                    if(chars[j] == ')'){
                        parCount--;
                    }
                    j++;
                }
                num = solve(s.substring(i+1, j-1));
                //i跳至已经计算的字串括号后
                i = j-1;
            }
            if(Character.isDigit(chars[i])){
                num = num*10+chars[i]-'0';
            }
            if(!Character.isDigit(chars[i]) || i == n-1){
                if(sign == '+'){
                    stack.push(num);
                }else if(sign == '-'){
                    stack.push(-1*num);
                }else if(sign == '*'){
                    stack.push(stack.pop() * num);
                }else if(sign == '/'){
                    stack.push(stack.pop() / num);
                }
                sign = chars[i];
                //上一个数复位为0
                num = 0;

            }
        }
        int res = 0;
        while(!stack.empty()){
            res += stack.pop();
        }
        return res;
    }
}
