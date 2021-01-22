package 字符串.仅仅反转字母;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        List<Character> list = new LinkedList<>();
        for (int i = chars.length - 1; i >= 0; i--) {
            if((chars[i]>='a' && chars[i]<='z') || (chars[i]>='A' && chars[i]<='Z')) {
                list.add(chars[i]);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if((chars[i]<'a' || chars[i]>'z') && (chars[i]<'A' || chars[i]>'Z')) {
                list.add(i,chars[i]);
            }
        }
        String s = "";
        for (Character c : list) {
            s += c;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
}
