package 颜色分类;

import java.util.Arrays;

public class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void sortColors1(int[] nums) {
        //插排
        for (int i = 0; i < nums.length-1; i++) {
            //标记需要判断的数
            int key = nums[i+1];
            int j = i;
            for(; j >= 0; j--) {
                if(key < nums[j]) {
                    nums[j+1] = nums[j];
                } else {
                    break;
                }
            }
            nums[j+1] = key;
        }
        System.out.println(Arrays.toString(nums));
    }
}
