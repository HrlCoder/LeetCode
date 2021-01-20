package 数组.第三大的数;

import java.util.Arrays;
import java.util.TreeSet;

public class Solution {
    public static int thirdMax(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new RuntimeException();
        }

        TreeSet<Integer> set = new TreeSet<>();
        for (Integer elem : nums) {
            set.add(elem);
            if (set.size() > 3) set.remove(set.first());
        }

        // set.last() 里面最大的元素
        // set.first() 里面最小的元素
        return set.size() < 3 ? set.last() : set.first();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMax(nums));
    }
}
