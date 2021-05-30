package 最小差值;

import java.util.*;

public class Solution {
    public int minDifference (int[] a) {
        // write code here
        Arrays.sort(a);
        int res = Integer.MAX_VALUE;
        for(int i=1;i<a.length;++i){
            //先确认这两个相减不越界
            if(a[i]-a[i-1] >=0){
                res = Math.min(res,a[i]-a[i-1]);
            }
        }
        return res;
    }
}
