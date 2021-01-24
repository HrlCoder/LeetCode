package 益智.最高分是多少;

import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        while (in.hasNextInt()) {
            int N = in.nextInt();//学生数目
            int M = in.nextInt();//操作数目

            int[] stu = new int[N];

            for (int i = 1; i <= N; i++) {
                map.put(i,in.nextInt());
            }

            for (int i = 1; i <= M; i++) {
                find(in.next(), in.nextInt(), in.nextInt(),map);
            }
        }
    }

    private static void find(String c, int num1, int num2,HashMap<Integer,Integer> map) {
        if(c.equals("Q")) {
            if(num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2  =temp;
            }

            int max = 0;
            for (int i = num1; i <= num2; i++) {
                if(map.get(i) > max) {
                    max = map.get(i);
                }
            }
            System.out.println(max);
        }
        if(c.equals("U")) {
            map.replace(num1,num2);
        }
    }
}