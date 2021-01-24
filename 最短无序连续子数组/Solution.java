package 数组.最短无序连续子数组;

import java.util.Arrays;

public class Solution {
    public static int findUnsortedSubarray(int[] nums) {
        int[] nums1 = new int[nums.length];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nums[i];
        }
        Arrays.sort(nums1);
        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums1[i]) {
                left = i;
                break;
            }
        }

        for (int i = nums.length-1; i >= 0; i--) {
            if(nums[i] != nums1[i]) {
                right = i;
                break;
            }
        }

        int num = right-left;
        if(num > 0) {
            return num+1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(findUnsortedSubarray(nums));
    }
}
