package 二进制中1的个数;

public class Solution {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int i = Integer.bitCount(n);
        return i;
    }

    public int hammingWeight1(int n) {
        int count = 0;
        while (n!=0) {
            count += n & 1;
            n = n>>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(255));
    }
}

