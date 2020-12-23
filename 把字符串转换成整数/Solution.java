package 把字符串转换成整数;

public class Solution {
    public static int strToInt(String str) {
        char[] chars = str.trim().toCharArray();
        // 去除空格后长度为0则返回0
        if (chars.length == 0){
            return 0;
        }
        int sign = 1, i = 0;
        int ans = 0;
        // 确定符号
        if (chars[i] == '-') {
            sign = -1;
            i++;
        }
        else if (chars[i] == '+')
            i ++;
        // 对连续数字进行遍历
        while (i < chars.length && isDigit(chars[i])) {
            // 当前位置对应的数字
            int k = sign * (chars[i] - '0');
            // 判断ans如果加上当前位的数字是否超出范围
            // 此处不能计算出新的ans再比较，因为计算出的新的ans可能已经超出范围了
            if (sign > 0 && ans > (Integer.MAX_VALUE - k) / 10)
                return Integer.MAX_VALUE;
            if (sign < 0 && ans < (Integer.MIN_VALUE - k) / 10)
                return Integer.MIN_VALUE;
            // 加入当前位的数字
            ans = ans * 10 + k;
            i ++;
        }
        return ans;
    }

    public static boolean isDigit(char c) {
        return c - '0' >= 0 && c - '9' <= 0;
    }

    public static void main(String[] args) {
        System.out.println(strToInt("91283472332"));
    }
}
