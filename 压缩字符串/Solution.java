package 字符串.压缩字符串;

import java.util.Arrays;

public class Solution {
    public static int compress(char[] chars) {
        int left = 0;
        int right = 1;
        String s = "";
        while (left <= right) {
            if(left <= right && chars[left] == chars[right]) {
                right++;
                if(right == chars.length) {
                    s += chars[left];
                    s += right - left;
                    break;
                }
            } else if(left <= right && chars[left] != chars[right]){
                s += chars[left];
                s += right - left;
                left = right;
            }
        }

        chars = new char[s.length()];
        for (int i = 0; i < s.toCharArray().length; i++) {
            chars[i] = s.charAt(i);
        }
        System.out.println(Arrays.toString(chars));
        return chars.length;
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
}
