package 数组中出现次数超过一半的数字;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static int MoreThanHalfNum_Solution(int [] array) {
        int mid = array.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])) {
                map.put(array[i],map.get(array[i])+1);
            } else {
                map.put(array[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if(i.getValue() > mid) {
                return i.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {1,2,2,2,2,2,7,8,9};
        System.out.println(MoreThanHalfNum_Solution(array));
    }
}
