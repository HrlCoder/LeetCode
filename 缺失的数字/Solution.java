package 缺失的数字;

public class Solution {
    public int missingNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if(num == nums[i]) {
                num++;
            }
        }
        return num;
    }
}
