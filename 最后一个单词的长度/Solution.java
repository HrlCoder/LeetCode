package 字符串.最后一个单词的长度;

public class Solution {
    public static int lengthOfLastWord(String s) {
        if(s.equals("") || s.equals(" ")) {
            return 0;
        }
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            if(i == s1.length-1) {
                return s1[i].length();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
