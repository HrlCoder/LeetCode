package 最长回文子串;

import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static int getLongestPalindrome(String A, int n) {
        Set<String> list = new TreeSet<>();
        for (int i = 0; i < A.length(); i++) {
            String str = "";
            for (int j = i; j < A.length(); j++) {
                str += A.charAt(j);
                list.add(str);
            }
        }

        int maxlength = 0;
        for (String s : list) {
            String reverse = new StringBuffer(s).reverse().toString();
            if(s.equals(reverse)) {
                maxlength = maxlength > s.length() ? maxlength : s.length();
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        String a = "bab";
        int n = a.length();
        System.out.println(getLongestPalindrome(a, n));
    }
}
