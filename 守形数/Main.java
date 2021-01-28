package 益智.守形数;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            show01(n);

        }
    }

    private static void show01(int n) {
        int m = n;
        int n2 = n * n;
        int count = 0;
        while (n > 1 ) {
            n = n / 10;
            count++;
        }
        int num = n2  % (int)Math.pow(10,count);
        if(m == num) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }
}
