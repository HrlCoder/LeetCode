package 数组.找到小镇的法官;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/11/1 9:37
 */
public class Solution {
    public int findJudge(int N, int[][] trust) {
        //定义一个票数的数组
        int[] degree  = new int[N+1];//总票数
        for (int[] i : trust) {
            degree[i[1]]++;//获得一票
            degree[i[0]]--;//投出一票
        }
        int judge = -1;
        for (int i = 1; i <= N; i++) {
            if(degree[i] == N-1 ) {
                judge = i;
                break;
            }
        }
        return judge;
    }
}
