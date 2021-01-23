package 字符串.验证回文串;

public class Solution {
    public static boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //isLetterOrDigit(char ch) 确定指定的字符是否是字母或数字。
            if (Character.isLetterOrDigit(ch)) {
                //toLowerCase(char ch) 转换为小写字符参数使用从unicodedata文件实例映射信息。
                sb.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer sbreverse = new StringBuffer(sb).reverse();
        return sb.toString().equals(sbreverse.toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
