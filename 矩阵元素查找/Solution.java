package 矩阵元素查找;

public class Solution {
    public int[] findElement(int[][] mat, int n, int m, int x) {
        // write code here
        int[] res=new int[2];
        int row=0,col=mat[0].length-1;
        while(row<mat.length && col>=0){
            if(mat[row][col]>x) col--;
            else if(mat[row][col]<x) row++;
            else{
                res[0]=row;
                res[1]=col;
                break;
            }
        }
        return res;
    }
}
