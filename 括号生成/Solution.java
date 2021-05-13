package 括号生成;

import java.util.*;

public class Solution {
    public ArrayList<String> generateParenthesis (int n) {
        // write code here
        ArrayList<String> res = new ArrayList<String>();
        help(res,"",n,0,0);
        return res;
    }
    public void help(ArrayList<String> res, String cur, int n, int left, int right){
        if(right == n){
            res.add(cur);
            return;
        }
        if(left < n){
            help(res,cur + "(",n,left + 1,right);
        }
        if(right < left){
            help(res,cur + ")",n,left,right + 1);
        }
    }
}
