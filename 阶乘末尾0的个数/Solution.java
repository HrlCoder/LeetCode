package 阶乘末尾0的个数;

public class Solution {
    public long thenumberof0 (long n) {
        // write code here
        long num = 0;
        long five = 5;
        while(n >= five){
            num += n / five;
            five *= 5;
        }
        return num;
    }
}
