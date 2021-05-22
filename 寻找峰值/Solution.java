package 寻找峰值;

public class Solution {
    public static int solve (int[] a) {
        if (a == null || a.length == 0) return -1;
        for (int i = a.length - 1; i >= 1; i--) {
            if (a[i] > a[i - 1]) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a= {2,4,1,2,7,8,4};
        System.out.println(solve(a));;
    }
}
