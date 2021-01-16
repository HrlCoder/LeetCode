package 数组.移除元素;

import java.util.Arrays;

public class Solution {
    public static int removeElement(int[] nums, int val) {
        int a = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[a] = nums[i];
                a++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums, 3));
    }
}
