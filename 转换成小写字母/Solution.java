package 字符串.转换成小写字母;

import java.util.Arrays;

public class Solution {
    public static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='A' && chars[i]<='Z') {
                chars[i] += 32;
            }
        }
        String s = "";
        for (char c : chars) {
            s += c;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
    }
}
