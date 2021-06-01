package 在旋转过的有序数组中寻找目标值;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author： 浪漫不死
 * @Date： 2021/6/1
 * @description：
 * @version: 1.0
 */
public class Solution {
    public static int search (int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {6,8,10,0,2,4};
        System.out.println(search(nums, 3));;
    }
}
