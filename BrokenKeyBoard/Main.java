package 字符串.BrokenKeyBoard;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> set = new LinkedHashSet<>();
        while (sc.hasNext()) {
            String s1 = sc.nextLine().toUpperCase();
            String s2 = sc.nextLine().toUpperCase();
            for (int i = 0; i < s1.length(); i++) {
                if(!s2.contains(s1.charAt(i)+"")) {
                    set.add(s1.charAt(i));
                }
            }
            for (Character c : set) {
                System.out.print(c);
            }
        }
    }
}
