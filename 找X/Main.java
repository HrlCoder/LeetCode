package 益智.找X;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            int i = 0;
            for (; i < nums.length; i++) {
                if(x == nums[i]) {
                    System.out.println(i);
                    break;
                }
            }
            if(i == nums.length) {
                System.out.println(-1);
            }
        }
    }
}
