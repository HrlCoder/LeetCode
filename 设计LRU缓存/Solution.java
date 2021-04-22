package 设计LRU缓存;

import java.util.*;

public class Solution {
    public int[] LRU (int[][] operators, int k) {
        //true 表示让 linkedHashMap 按照访问顺序来进行排序，最近访问的放在尾部，最老访问的放在头部。
        LinkedHashMap<Integer, Integer> urlMap = new LinkedHashMap<Integer, Integer>((int)Math.ceil(k/0.75)+1, 0.75f, true);
        ArrayList<Integer> list = new ArrayList<>();
        for(int[] op: operators){
            if(op[0] == 1){
                if(urlMap.size() >= k){
                    urlMap.remove(urlMap.keySet().iterator().next());
                }
                urlMap.put(op[1], op[2]);
            }
            else if(op[0] == 2){
                if(urlMap.get(op[1]) == null){
                    list.add(-1);
                }else {
                    list.add(urlMap.get(op[1]));
                }
            }
        }
        int[] res = new int[list.size()];
        int index = 0;
        for(int i : list){
            res[index++] = i;
        }
        return res;
    }
}
