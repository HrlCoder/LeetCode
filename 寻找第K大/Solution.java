package 寻找第K大;

public class Solution {
    public static int findKth(int[] a, int n, int K) {
        if(a.length == 0 || n == 0) return -1;
        quickSort(a,0,n-1);
        int num = a[n-K];
        return num;
    }

    public static void quickSort(int[] a,int low, int high) {
        int i,j,temp,t;
        i = low;
        j = high;
        if(low > high) return;
        temp = a[low];
        while(i < j) {
            while(temp <= a[j] && i < j) {
                j--;
            }
            while(temp >= a[i] && i < j) {
                i++;
            }
            if(i < j) {
                t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }
        a[low] = a[i];
        a[i] = temp;
        quickSort(a,low,j-1);
        quickSort(a,i+1,high);
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,2,2};
        System.out.println(findKth(a, 5, 3));
    }
}
