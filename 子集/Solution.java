package 数组.子集;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 递归
     */
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        //空集是子集
        lists.add(new ArrayList<>());

        for (int num : nums) {
            List<List<Integer>> newlists = new ArrayList<>();
            for (List<Integer> list : lists) {
                List<Integer> newlist = new ArrayList<>(list);
                newlist.add(num);
                newlists.add(newlist);
            }
            lists.addAll(newlists);
        }
        return lists;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
}
