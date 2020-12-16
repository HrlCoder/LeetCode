package 数组中重复的数字;

/**
 * 遍历多次数组，如果出现i==j的情况，就说明有重复元素
 */
public class Solution {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}

/**
 * 如果没有重复数字，那么正常排序后，数字i应该在下标为i的位置，
 * 所以思路是重头扫描数组，遇到下标为i的数字如果不是i的话，（假设为m),
 * 那么我们就拿与下标m的数字交换。在交换过程中，
 * 如果有重复的数字发生，那么终止返回ture。
 */

class Solution1 {
    public int findRepeatNumber(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if(nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }
}