package 大数相加;

public class Solution {
    public static String solve (String s, String t) {
        int len = Math.max(s.length(),t.length())+1;

        char[] a = new char[len];
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        len--;
        int sLen = s.length()-1;
        int tLen = t.length()-1;
        int carry = 0;

        while(sLen >= 0 || tLen >= 0 || carry >0){
            int sValue = sLen >= 0 ? sChar[sLen--]-'0':0;
            int tValue = tLen >= 0 ? tChar[tLen--]-'0':0;

            int sum = carry + sValue + tValue;
            carry = sum /10;
            a[len--] = (char)(sum%10 +'0');
        }

        return len == 0 ? String.valueOf(a).substring(1) : String.valueOf(a);
    }

    public static void main(String[] args) {
        String s = "1";
        String t = "99";
        System.out.println(solve(s, t));
    }
}
