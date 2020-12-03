package 个位数统计;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String m = "0123456789";
        int[] num = new int[10];
        for (int i = 0; i < m.length(); i++) {
            int count = 0;
            for (int j = 0; j < n.length(); j++) {
                if(n.charAt(j)==m.charAt(i)) {
                    count++;
                }
            }
            num[i] = count;
        }
        for (int i = 0; i < num.length; i++) {
            if(num[i] != 0) {
                System.out.println(i+":"+num[i]);
            }
        }
    }
}
