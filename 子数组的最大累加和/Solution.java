package 子数组的最大累加和;

public class Solution {
    public static int maxsumofSubarray (int[] arr) {
        int res = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(sum <= 0) sum = 0;
            sum += arr[i];
            if(sum > res) res = sum;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 5, -2, 6, -1};
        System.out.println(maxsumofSubarray(arr));
    }
}
