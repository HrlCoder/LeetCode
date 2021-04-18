package 数组中相加为零的三元组;

import java.util.ArrayList;

public class Solution {
    public static int[] b = new int[3];
    public static ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        show(num,0,0);
        return lists;
    }

    private static void show(int[] num,int index,int count) {
        if(count == 3) {
            printNum();//打印结果
        } else {
            if(count == 0) {
                b = new int[3];
            }
            for(int i = index; i < num.length;i++){
                b[count] = num[i];
                show(num,i+1,count+1);
            }
        }
    }
    //打印结果
    private static void printNum() {
        ArrayList<Integer> list = new ArrayList<>();
        int num = 0;
        for (int i : b) {
            list.add(i);
            num += i;
        }
        if(num == 9) {
            lists.add(list);
        }
    }

    public static void main(String[] args) {
        int[] num = {-2,0,1,1,2,6,4,8,0,4,3,2,5,9};
        System.out.println(threeSum(num));
    }
}
