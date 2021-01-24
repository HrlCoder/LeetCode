package 数组.在排序数组中查找元素的第一个和最后一个位置;

import java.util.Arrays;

public class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if(left < right && nums[left] != target && nums[right] != target) {
                left++;
                right--;
            } else if(left < right && nums[left] == target && nums[right] != target) {
                right--;
            } else if(left < right && nums[left] != target && nums[right] == target) {
                left++;
            } else if(left <= right && nums[left] == target && nums[right] == target) {
                return new int[]{left,right};
            } else if(left > right) {

                return new int[] {-1,-1};
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 6)));
    }
}
