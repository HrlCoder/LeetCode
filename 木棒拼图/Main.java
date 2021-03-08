package 木棒拼图;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) {
            int sum = 0;
            int n = sc.nextInt();//操作数量
            for (int i = 0; i < n; i++) {
                int I = sc.nextInt();//操作类型
                int L = sc.nextInt();//长度
                if(I == 1) {
                    int j = 0;
                    for (; j < list.size(); j++) {
                        if(list.get(j) >= L) {
                            list.add(j,L);
                            break;
                        }
                    }
                    if(list.size() == j) {
                        list.add(L);
                    }
                    sum += L;
                } else {
                    list.remove(list.indexOf(L));
                    sum -= L;
                }
                int max = list.get(list.size()-1);
                if(sum - max > max ) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
