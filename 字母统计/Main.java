package 字符串.字母统计;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            Map<Character,Integer> map = new HashMap<>();
            for (int i = 65; i < 91; i++) {
                map.put((char)i,0);
            }

            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(map.containsKey(chars[i])) {
                    map.replace(chars[i],map.get(chars[i])+1);
                }
            }
            for (Character c : map.keySet()) {
                System.out.println(c +":" + map.get(c));
            }
        }
    }
}
