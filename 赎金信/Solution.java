package 字符串.赎金信;

import java.util.Arrays;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //字符串转数组
        char[] c1 = ransomNote.toCharArray();
        char[] c2 = magazine.toCharArray();
        //排序
        Arrays.sort(c1);
        Arrays.sort(c2);
        int i = 0,j = 0;
        //循环遍历，比较两个数组的值是否相等，
        // 相等，双指针后移，大于，杂志指针后移，小于，说明不全，返回false
        while (i < c1.length && j < c2.length) {
            if(c1[i] > c2[j]) {
                j++;
            } else if(c1[i] < c2[j]) {
                return false;
            } else {
                i++;
                j++;
            }
        }
        return i == c1.length;
    }
}

