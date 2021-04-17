package 反转数字;

public class Solution {
    public static int reverse (int x) {
        int flag = 1;
        if(x < 0) {
            x = -x;
            flag = -1;
        }
        int num = 0;
        while(x != 0) {
            num = num*10 + x%10;
            x = x/ 10;
        }
        return flag*num;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-1234));
    }
}
