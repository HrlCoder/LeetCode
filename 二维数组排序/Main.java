package 二维数组排序;

public class Main {
    public static int[] arrayPrint(int[][] arr, int n) {
        int[] result = new int[n*n];
        int index = 0;
        int X = 0;
        int Y = n - 1;
        while (X < n) {
            int x = X;
            int y = Y;
            while (x < n && y < n) {
                result[index++] = arr[x++][y++];
            }
            if(Y > 0) {
                Y--;
            } else {
                X++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        arrayPrint(arr,4);
    }
}