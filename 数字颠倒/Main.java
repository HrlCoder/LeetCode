package 益智.数字颠倒;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        String s = a.toString();
        char[] ch = s.toCharArray();
        String s1 = "";
        for (int i = ch.length-1; i >= 0; i--) {
            s1 += ch[i];
        }
        System.out.println(s1);
    }
}
