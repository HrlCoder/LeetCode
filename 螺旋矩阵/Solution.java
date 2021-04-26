package 螺旋矩阵;

import java.util.*;

public class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if(matrix.length == 0) return list;
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (true) {
            for(int i = left; i <= right; i++) list.add(matrix[top][i]);
            top++;
            if(left > right || top > bottom) break;

            for(int i = top; i <= bottom; i++) list.add(matrix[i][right]);
            right--;
            if(left > right || top > bottom) break;

            for(int i = right; i >= left; i--) list.add(matrix[bottom][i]);
            bottom--;
            if(left > right || top > bottom) break;

            for(int i = bottom; i >= top; i--) list.add(matrix[i][left]);
            left++;
            if(left > right || top > bottom) break;
        }
        return list;
    }
}
