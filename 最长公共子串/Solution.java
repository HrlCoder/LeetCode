package 最长公共子串;

public class Solution {

    public static String LCS1 (String str1, String str2) {
        int start = 0;
        int end = 1;
        String result = "";

        while (end <= str2.length()) {
            String subStr = str2.substring(start, end);

            if (str1.contains(subStr)) {
                result = subStr;
            } else {
                start++;
            }
            end++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(LCS1("1AB2345CD", "12345EF"));
    }

    //动态规划
    public String LCS (String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];
        int max = 0, index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                    if (max < dp[i + 1][j + 1]) {
                        max = dp[i + 1][j + 1];
                        index = i + 1;
                    }
                }
            }
        }
        return max == 0 ? "-1" : str1.substring(index-max,index);
    }
}
