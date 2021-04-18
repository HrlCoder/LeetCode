package 数组中相加为零的三元组;

import java.util.*;

public class Solution2 {
    public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++){
            //没有负数，条件不成立
            if (num[i] > 0) break;
            if (i > 0 && num[i] == num[i - 1]) continue;
            int left = i + 1;
            int right = num.length - 1;
            while (left < right){
                int sum = num[i] + num[left] + num[right];
                if (sum == 0) {
                    list.add(new ArrayList<>(Arrays.asList(num[i], num[left], num[right])));
                    while (left < right && num[left] == num[left + 1]) left++;
                    while (left < right && num[right] == num[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum > 0) right--;
                else left++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] num = {-2,0,1,1,2,6,4,8,0,4,3,2,5,9};
        System.out.println(threeSum(num));
    }
}
