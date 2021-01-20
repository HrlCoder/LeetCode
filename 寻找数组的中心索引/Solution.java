package 数组.寻找数组的中心索引;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int leftsum = 0;
        for (int x: nums) {
            sum += x;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (2 * leftsum == sum - nums[i]) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }
}
