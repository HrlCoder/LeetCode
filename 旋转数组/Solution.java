package 数组.旋转数组;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void rotate(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = nums.length-k; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < nums.length-k; i++) {
            list.add(nums[i]);
        }
        System.out.println(list);
    }

    public static void rotate1(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        System.out.println(Arrays.toString(newArr));
    }


    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        rotate1(nums,2);
    }
}
