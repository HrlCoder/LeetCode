package 合并区间;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals,new Comparator<Interval>(){
            public int compare(Interval o1,Interval o2){
                return o1.start-o2.start;
            }
        });
        for(int i=1;i<intervals.size();i++){
            if(intervals.get(i).start<=intervals.get(i-1).end){
                intervals.set(i,new Interval(intervals.get(i-1).start,Math.max(intervals.get(i).end,intervals.get(i-1).end)));
                intervals.remove(i-1);
                i--;
            }
        }
        return intervals;
    }
}

class Interval {
    int start;
    int end;
    Interval() {
        start = 0;
        end = 0;
    }
    Interval(int s, int e) {
        start = s; end = e;
    }
}
