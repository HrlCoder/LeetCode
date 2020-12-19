package 和为s的两个数字;

import java.util.Arrays;

public class Solution {

    //leetcode超出时间限制
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i != j && (nums[i]+nums[j] == target)) {
                    return new int[]{nums[i],nums[j]};
                }
            }
        }
        return new int[]{};
    }


    public static int[] twoSum1(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            if(nums[left] + nums[right] < target){
                left++;
            }else if(nums[left] + nums[right] > target){
                right--;
            }else if(nums[left] + nums[right] == target){
                return new int[]{nums[left],nums[right]};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
//        int[] nums = {14,15,16,22,53,60,76};
//        int target = 76;
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}

