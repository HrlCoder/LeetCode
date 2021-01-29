package 益智.数字和为sum的方法数;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < A.length; i++) {
                A[i] = sc.nextInt();
            }
            System.out.println(show(A, sum));
        }
    }

    private static long show(int[] a, int sum) {
        long[] dp = new long[sum+1];
        dp[0] = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = sum; j >= a[i]; j--) {
                dp[j] = dp[j - a[i]]+dp[j];
            }
        }
        return dp[sum];
    }
}
