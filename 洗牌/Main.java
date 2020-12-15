package 队列.洗牌;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //数据组数
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            ArrayList<Integer> list1 = new ArrayList<>();//存牌
            ArrayList<Integer> list2 = new ArrayList<>();//存洗牌后的牌
            int n = sc.nextInt();//每组牌数
            int k = sc.nextInt();//洗牌次数

            for (int y = 0; y < 2*n; y++) {
                list1.add(sc.nextInt());
            }
            //洗牌
            for (int j = k; j > 0; j--) {
                Queue<Integer> q1 = new LinkedList<>();
                Queue<Integer> q2 = new LinkedList<>();
                list2 = new ArrayList<>();
                //把前一半数据放入队列q1，把后一半数据放入队列q2
                for (int i1 = 0; i1 < list1.size(); i1++) {
                    if(i1<list1.size()/2) {
                        q1.add(list1.get(i1));
                    } else {
                        q2.add(list1.get(i1));
                    }
                }

                //按照q1q2顺序出队列，存入集合中
                for (int i2 = 0; i2 < n; i2++) {
                    list2.add(q1.remove());
                    list2.add(q2.remove());
                }
                list1 = list2;
            }
            //打印
            for (int m = 0; m < list2.size(); m++) {
                if(m==list2.size()-1) {
                    System.out.println(list2.get(m));
                } else {
                    System.out.print(list2.get(m)+" ");
                }
            }
        }
    }
}