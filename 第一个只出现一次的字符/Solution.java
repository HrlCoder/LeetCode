package 第一个只出现一次的字符;

public class Solution {
    //解法一
    public char firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);

            //首次出现的位置是当前位置，且后面没有再出现这个字符
            if(s.indexOf(ch) == i && s.indexOf(ch,i+1)==-1)
                return s.charAt(i);
        }
        return ' ';
    }

    //解法二
    public static char firstUniqChar1(String s) {
        int[] count = new int[26];
        char[] chars = s.toCharArray();
        for(char c : chars) {
            count[c - 'a']++;
        }
        for(char c : chars) {
            if(count[c - 'a'] == 1) {
                return c;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar1("aabbccdd"));
    }
}
