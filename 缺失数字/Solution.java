package 缺失数字;

public class Solution {
    public static int solve (int[] a) {
        int num = 0;
        int i = 0;
        for (; i < a.length; i++) {
            if(num == a[i]) num++;
            else break;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,7,8};
        System.out.println(solve(a));
    }
}
