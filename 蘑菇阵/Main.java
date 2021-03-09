package 蘑菇阵;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            boolean[][] map = new boolean[n][m];
            for(int i = 0; i < k; i++) {
                int x = sc.nextInt()-1;
                int y = sc.nextInt()-1;
                map[x][y] = true;
            }
            double[][] dp = new double[n][m];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(i == 0 && j == 0) {
                        dp[i][j] = 1.0;
                    } else if(map[i][j] == true) {
                        dp[i][j] = 0;
                    } else {
                        double d1;
                        double d2;
                        if(i - 1 < 0) {
                            d1 = 0;
                        } else {
                            if(j + 1 >= m) {
                                d1 = dp[i-1][j];
                            } else {
                                d1 = dp[i-1][j]*0.5;
                            }
                        }

                        if(j - 1 < 0) {
                            d2 = 0;
                        } else {
                            if(i + 1 >= n) {
                                d2 = dp[i][j-1];
                            } else {
                                d2 = dp[i][j-1]*0.5;
                            }
                        }
                        dp[i][j] = d1 + d2;
//                        dp[i][j] = (i-1<0 ? 0 : (j+1 >= m ? dp[i-1][j] : dp[i-1][j]*0.5)) + (j-1<0 ? 0 : (i+1)>=n ? dp[i][j-1] : dp[i][j-1]*0.5);
                    }
                }
            }
            System.out.printf(String.format("%.2f",dp[n-1][m-1]));
        }
    }
}
