package 数组中出现次数超过一半的数字;

import java.util.Arrays;

public class Solution {
    //数组升序，然后找到最中间的数输出
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
