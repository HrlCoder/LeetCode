package 字符串.奇偶校验;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
//            show(s);
            show1(s);
        }
    }

    private static void show1(String s) {
        char[] array = s.toCharArray();
        for (char c : array) {
            String s1 = Integer.toBinaryString(c);
            String s2 = String.format("%07d", Integer.parseInt(s1));
            System.out.println(s1);
            System.out.println(s2);
            int count = 0;
            for (int j = 0; j < 7; j++) {
                if (s2.charAt(j) == '1') count++;
            }
            System.out.println(count % 2 == 0 ? "1" + s2 : "0" + s2);
        }
    }

    private static void show(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(Integer.toString(chars[i],2));
        }
    }
}