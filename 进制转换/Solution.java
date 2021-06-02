package 进制转换;

public class Solution {
    public String solve (int M, int N) {
        String t = "0123456789ABCDEF";
        if(M == 0){
            return "0";
        }
        StringBuffer ans =new StringBuffer();//此方法针对的是io流
        boolean fu = false;//记录一下M是不是负数
        if(M < 0){
            fu = true; M =- M;
        }//如果是负数，换成正数计算，最后再加上符号位
        while(M != 0) {
            ans.append(t.charAt(M%N));
            M /= N;
        }
        if(fu){
            ans.append('-');
        }
        return ans.reverse().toString();
    }
}
