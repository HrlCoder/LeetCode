package 顺时针打印矩阵;

import java.util.Arrays;

public class Printer {
    public static int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code here
        int[] res = new int[n*m];
        int top = 0;
        int under = n-1;
        int left = 0;
        int right = m-1;
        int k = 0;
        for (int y = 0; y < res.length; y++) {
            while (left <= right && top <= under) {

                for(int i = left; i <= right; i++){ //从左到右
                    res[k++] = mat[top][i];
                }
                top ++;
                for(int i = top; i <= under; i++){ //从上到下
                    res[k++] = mat[i][right];
                }
                right --;
                for(int i = right; i >= left && top <= under; i--){    //从右到左
                    res[k++] = mat[under][i];
                }
                under --;
                for(int i = under; i >= top && left <= right; i--){    //从下到上
                    res[k++] = mat[i][left];
                }
                left ++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(clockwisePrint(mat, 3, 3)));
    }
}
