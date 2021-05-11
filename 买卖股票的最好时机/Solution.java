package 买卖股票的最好时机;

public class Solution {

    public static int maxProfit (int[] prices) {
        if(prices == null || prices.length <= 1) return 0;
        int res = 0;
        int buy = Integer.MIN_VALUE;
        for(int i=0; i<prices.length; i++){
            buy = Math.max(buy, -prices[i]);
            res = Math.max(res, buy+prices[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,4,2};
        System.out.println(maxProfit(a));
    }
}
