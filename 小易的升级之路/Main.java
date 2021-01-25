package 益智.小易的升级之路;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            int c = in.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < b.length; i++) {
                b[i] = in.nextInt();
            }
            System.out.println(growing(b, c));
        }
    }

    public static int growing(int[] b,int c) {
        for (int i = 0; i < b.length; i++) {
            if (c >= b[i]) {
                c += b[i];
            } else {
                c += gcb(c, b[i]);
            }
        }
        return c;
    }

    //求最大公约数
    private static int gcb(int c, int i) {
        if(i == 0) return c;
        return gcb(i,c%i);
    }
}
