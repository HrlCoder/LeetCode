package 设计功能栈;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] getMinStack (int[][] op) {
        // write code here
        if(op==null || op.length==0 || op[0].length==0){
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        List<Integer> minList = new ArrayList<>();
        for (int[] ints : op) {
            if(ints[0]==1){
                if(minList.size()==0){
                    minList.add(ints[1]);
                }else {
                    int temp = minList.get(minList.size()-1);
                    if(temp<ints[1]){
                        minList.add(temp);
                    }else {
                        minList.add(ints[1]);
                    }
                }
            }else if(ints[0]==2){
                minList.remove(minList.size()-1);
            }else {
                list.add(minList.get(minList.size()-1));
            }
        }
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();++i){
            result[i] = list.get(i);
        }
        return result;
    }
}
