package 数组.两数之和;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(target == nums[i]+nums[j]) {
                    int[] array = {i,j};
                    return array;
                }
            }
        }
        return null;
    }
}
