package 调整数组顺序使奇数位于偶数前面;

public class Solution {
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            while (left < right && nums[left]%2 != 0) {
                left++;
            }
            while (left < right && nums[right]%2 != 1) {
                right--;
            }
            if(left < right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }
}
