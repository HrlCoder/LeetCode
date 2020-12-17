package 青蛙跳台阶问题;

public class Solution {
    public int numWays(int n) {
        int a = 1, b = 1, temp;
        for(int i = 0; i < n; i++){
            temp = (a + b) % 1000000007;
            a = b;
            b = temp;
        }
        return a;
    }
}
