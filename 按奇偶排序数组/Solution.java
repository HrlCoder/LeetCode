package 数组.按奇偶排序数组;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author： 浪漫不死
 * @Date： 2021/1/20
 * @description：
 * @version: 1.0
 */
public class Solution {
    public static int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length-1;
        for (int i = 0; i < A.length; i++) {
            while (left < right) {
                if(left < right && A[left]%2 == 1 && A[right]%2 == 0) {
                    int temp = A[left];
                    A[left] = A[right];
                    A[right] = temp;
                    left++;
                    right--;
                } else if(left < right && A[left]%2 == 0 && A[right]%2 == 1) {
                    left++;
                    right--;
                } else if(left < right && A[left]%2 == 0 && A[right]%2 == 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return A;
    }


    public static void main(String[] args) {
        int[] A = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(A)));
    }
}
