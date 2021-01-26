package 益智.学分绩点;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();//总的课程数
            int[] xfarr = new int[n];
            int xfsum =0;
            for (int i = 0; i < xfarr.length; i++) {
                xfarr[i] = in.nextInt();
                xfsum += xfarr[i];
            }
            int[] cjarr = new int[n];
            for (int i = 0; i < cjarr.length; i++) {
                cjarr[i] = in.nextInt();
            }
            double[] jdarr = new double[n];
            double jdsum = 0;
            //学分绩点=课程绩点*课程学分
            //总绩点 = 所有绩点之和/所有学分之和
            for (int i = 0; i < cjarr.length; i++) {
                double jd = 0;//课程绩点
                if(cjarr[i] >= 90 && cjarr[i] <= 100) {
                    jd = 4.0;
                } else if(cjarr[i] >= 85 && cjarr[i] <= 89) {
                    jd = 3.7;
                }else if(cjarr[i] >= 82 && cjarr[i] <= 84) {
                    jd = 3.3;
                }else if(cjarr[i] >= 78 && cjarr[i] <= 81) {
                    jd = 3.0;
                }else if(cjarr[i] >= 75 && cjarr[i] <= 77) {
                    jd = 2.7;
                }else if(cjarr[i] >= 72 && cjarr[i] <= 74) {
                    jd = 2.3;
                }else if(cjarr[i] >= 68 && cjarr[i] <= 71) {
                    jd = 2.0;
                }else if(cjarr[i] >= 64 && cjarr[i] <= 67) {
                    jd = 1.5;
                }else if(cjarr[i] >= 60 && cjarr[i] <= 63) {
                    jd = 1.0;
                }else if(cjarr[i] < 60) {
                    jd = 0;
                }
                jdarr[i] = jd * xfarr[i];
                jdsum += jdarr[i];
            }
            System.out.printf("%.2f",jdsum/xfsum);
        }
    }
}