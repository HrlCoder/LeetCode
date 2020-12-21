package 连续子数组的最大和;

public class Solution {
    /**
     *temp是临时存储和的值。遍历数组相加
     * 当temp > max 时，更新max
     * 当temp < max 时，重置temp
     */
    public int maxSubArray(int[] nums) {
        int temp = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            temp += nums[i];
            if (temp > max) {
                max = temp;
            }
            if (temp < 0) {
                temp = 0;
            }
        }
        return max;
    }
}
