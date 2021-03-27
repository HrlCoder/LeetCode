package 左右最值最大差;

import java.util.ArrayList;

public class MaxGap {
    public static int findMaxGap(int[] A, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int limitIndex = 1;
        int leftmax = 0;

        while (limitIndex < A.length) {
            for (int i = 0; i < limitIndex; i++) {
                if(A[i] > A[leftmax]) {
                    leftmax = i;
                }
            }

            int rightmax = limitIndex;
            for (int j = limitIndex; j < A.length; j++) {
                if(A[j] > A[rightmax]) {
                    rightmax = j;
                }
            }
            if(A[leftmax] < A[rightmax]) {
                list.add(A[rightmax]-A[leftmax]);
            } else {
                list.add(A[leftmax]-A[rightmax]);
            }
            limitIndex++;
        }
        int max = 0;
        for (Integer i : list) {
            if(max < i) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {28,75,38,44,66,1};
        int n = arr.length;
        System.out.println(findMaxGap(arr,n));
    }
}
