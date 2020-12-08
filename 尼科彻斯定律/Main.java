package 字符串.尼科彻斯定律;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int m = 0;
            String str = "";
            for (int i = 0; i < a; i++) {
                if(i == 0) {
                    m = a*(a-1)+1;
                } else {
                    m += 2;
                }
                if(i < a-1) {
                    str += m;
                    str += "+";
//                    System.out.print(m+"+");
                } else {
                    str += m;
//                    System.out.print(m);
                }
            }
            System.out.println(str);
        }
    }
}
