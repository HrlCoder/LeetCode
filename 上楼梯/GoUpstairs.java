package 益智.上楼梯;


public class GoUpstairs {
    public static int countWays(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 4;
        if(n > 3) {
            return (countWays(n-1)+countWays(n-2)+countWays(n-3))%1000000007;
        }
        return 0;
    }

    public int countWays1(int n) {
        if(n <= 2) {
            return n;
        }
        long[] dp = new long[n+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4;i< dp.length;i++){
            dp[i] = (dp[i-1]+dp[i-2]+dp[i-3])%1000000007;
        }
        return (int)dp[n];
    }

    public static void main(String[] args) {
        System.out.println(countWays(15));
    }
}
