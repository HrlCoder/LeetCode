package 找到字符串的最长无重复字符子串;

import java.util.LinkedList;

public class Solution {
    public int maxLength (int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();
        int maxlength = 0;
        for (int i = 0; i < arr.length; i++) {
            if(list.contains(arr[i])) {
                int j = list.indexOf(arr[i]);
                while (j-- >= 0) {
                    list.removeFirst();
                }
            }
            list.add(arr[i]);
            maxlength = Math.max(maxlength,list.size());
        }
        return maxlength;
    }
}
