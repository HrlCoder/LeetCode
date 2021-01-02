package 翻转单词顺序;

public class Solution {
    public static String reverseWords(String s) {
        // 删除首尾空格，分割字符串
        String[] strs = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            if (strs[i].equals("")) continue;
            sb.append(strs[i] + " ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
}
