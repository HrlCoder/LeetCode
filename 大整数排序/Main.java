package 字符串.大整数排序;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            BigInteger[] nums =  new BigInteger[n];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextBigInteger();
            }
            Arrays.sort(nums);
            for (BigInteger num : nums) {
                System.out.println(num);
            }
        }
    }
}