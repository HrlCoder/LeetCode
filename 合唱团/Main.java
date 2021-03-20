package 合唱团;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] ns = new int[n];
            for (int i = 0; i < ns.length; i++) {
                ns[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int d = sc.nextInt();

            long[][] max = new long[k][n];
            long[][] min = new long[k][n];
            for(int i = 0; i < k; i++){
                for(int j = 0; j < n; j++){
                    max[i][j] = 1;
                    if(i == 0){
                        min[i][j] = ns[j];
                        max[i][j] = ns[j];
                    }
                }
            }

            for(int i = 1; i < k; i++){
                for(int j = 0; j < n; j++){
                    for(int m = 1; m <= d; m++){
                        if(j - m >= 0){
                            if(ns[j] > 0){
                                min[i][j] = Math.min(min[i][j], min[i - 1][j - m] * ns[j]);
                                max[i][j] = Math.max(max[i][j], max[i - 1][j - m] * ns[j]);
                            } else{
                                min[i][j] = Math.min(min[i][j], max[i - 1][j - m] * ns[j]);
                                max[i][j] = Math.max(max[i][j], min[i - 1][j - m] * ns[j]);
                            }
                        }
                    }
                }
            }
            long Max = 0;
            for(int i = 0; i < n; i++) {
                Max = Math.max(Max, max[k - 1][i]);
            }
            System.out.println(Max);
        }
    }
}
