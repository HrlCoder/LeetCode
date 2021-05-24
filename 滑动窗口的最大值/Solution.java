package 滑动窗口的最大值;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if(size <= 0|| size > num.length)return list;
        int left = 0;
        int right = size - 1;
        while(right<num.length){
            list.add(getMax(num,left,right));
            left++;
            right++;
        }
        return list;
    }

    public int getMax(int[] num,int left,int right){
        if(num.length==0 || left<0 || right>num.length)return -1;
        int max = Integer.MIN_VALUE;
        for(int i = left;i <= right;i++){
            max = max > num[i] ? max : num[i];
        }
        return max;
    }
}
