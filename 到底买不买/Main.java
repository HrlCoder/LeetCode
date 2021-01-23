package 益智.到底买不买;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s1 = in.next();
            String s2 = in.next();
            buy(s1, s2);
        }
    }

    public static void buy(String s1,String s2) {
        LinkedList<Character> list = new LinkedList<>();
        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            list.add(ch);
        }
        int count = 0;
        for(int i = 0; i < s2.length(); i++){
            char ch = s2.charAt(i);
            for(int j = 0; j < list.size(); j++){
                if(ch == list.get(j)){
                    list.remove(j);
                    count++;
                    break;
                }
            }
        }
        if(count == s2.length()) {
            System.out.println("Yes " + (s1.length() - count));
        } else {
            System.out.println("No "+ (s2.length() - count));
        }
    }
}
