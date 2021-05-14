package 最小编辑代价;

public class Solution {
    public int minEditCost (String str1, String str2, int ic, int dc, int rc) {
        int[] res=new int[str2.length()+1];
        int i,j,minres=Math.min(ic+dc,rc),leftTop,t;
        char[] c1=str1.toCharArray(),c2=str2.toCharArray();
        res[0]=0;
        for(i=1;i<=c2.length;i++) {
            res[i] = i * ic;
        }
        for(i=1;i<=c1.length;i++) {
            leftTop=res[0];
            res[0]=i*dc;
            for(j=1;j<=c2.length;j++) {
                t=res[j];
                if(c1[i-1]==c2[j-1]) {
                    res[j] = leftTop;
                } else {
                    res[j]=Math.min(Math.min(res[j]+dc,res[j-1]+ic),leftTop+minres);
                }
                leftTop=t;
            }
        }
        return  res[c2.length];
    }
}
