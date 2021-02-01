package 字符串.简单错误记录;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        while (in.hasNext()) {
            String str = in.next();
            int strnum = in.nextInt();
            String[] arr = str.split("\\\\");
            String s = arr[arr.length-1];
            if(s.length() > 16) {
                s = s.substring(s.length() - 16);
            }

            String key = s + " " + strnum;
            if(map.containsKey(key)) {
                map.put(key,map.get(key)+1);
            } else {
                map.put(key,1);
            }
            int count = 0;
            for (String str1 : map.keySet()) {
                count++;
                if(count > (map.keySet().size()-8)) {
                    System.out.println(str1 +  " " +map.get(str1));
                }
            }
        }
    }
}