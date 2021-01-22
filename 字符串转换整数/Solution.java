package 字符串.字符串转换整数;

public class Solution {
    public static int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        while(i < n && s.charAt(i) == ' ') {
            i++;
        }
        if(i == n) {
            return 0;
        }
        int flag = 1;
        if(s.charAt(i) == '+' || s.charAt(i) == '-'){
            if(s.charAt(i)=='-') {
                flag=-1;
            }
            i++;
        }
        int ans = 0;
        while(i<n && Character.isDigit(s.charAt(i))) {
            int temp = s.charAt(i)-'0';
            if (flag == 1 && (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && temp > 7))) {
                return Integer.MAX_VALUE ;
            }
            //以正数为列，考虑稳大于和加temp才大于的情况
            if (flag == -1 && (ans > - (Integer.MIN_VALUE / 10) || (ans == -(Integer.MIN_VALUE / 10) && temp > 8))){
                return Integer.MIN_VALUE;
            }
            ans = ans * 10 + temp;
            i++;
        }
        return ans * flag;
    }

    public int myAtoi1(String s) {
        if (s == null) {
            return 0;
        }
        s = s.trim();
        if (s.length() <= 0) {
            return 0;
        }
        boolean nf = s.charAt(0) == '-' ? true : false;
        boolean zf = s.charAt(0) == '+' ? true : false;
        int res = 0;
        boolean full = false;  //溢出标志
        // 若第一个字符为'+'或者'-'则从i=1开始，这样可以减少循环内对'+''-'的判断
        for (int i = (nf || zf) ? 1 : 0; i < s.length(); ++i) {
            // 正常字符处理
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                int cur = s.charAt(i) - '0';
                // 溢出处理，因为res * 10可能造成溢出，所以转换为/来判断
                if (res > (Integer.MAX_VALUE - cur) / 10) {
                    full = true;
                    break;
                }
                res = res * 10 + cur;
            } else {
                break;
            }
        }
        return full ? (nf ? Integer.MIN_VALUE : Integer.MAX_VALUE) : (nf ? -res : res);
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }
}
