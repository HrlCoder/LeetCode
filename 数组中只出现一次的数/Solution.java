package 数组中只出现一次的数;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int foundOnceNumber (int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if(i.getValue() == 1) {
                return i.getKey();
            }
        }
        return -1;
    }
}
