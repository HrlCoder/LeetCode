package 不用加减乘除做加法;

public class Solution {
    public static void add(int a, int b) {
        int c = 0;
        while(b != 0) { // 当进位为 0 时跳出
            c = (a & b) << 1;  // c = 进位
            a ^= b; // a = 非进位和
            b = c; // b = 进位
        }
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        add(1, 1);
    }
}
