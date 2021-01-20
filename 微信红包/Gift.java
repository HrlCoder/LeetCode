package 数组.微信红包;

import java.util.Arrays;

public class Gift {
    public static int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);
        return gifts[n/2] == gifts[n/2-1] ? gifts[n/2] : 0;
    }

    public static void main(String[] args) {
        int[] gifts = {1,1};
        System.out.println(getValue(gifts, 2));
    }
}
