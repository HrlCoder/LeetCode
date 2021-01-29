package 益智.年会抽奖;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            double sum1=factorical(n);
            double sum2=show(n);
            double result=(sum2/sum1)*100; //计算成%的形式
            System.out.println(String.format("%.2f",result)+"%");
        }
    }
    //计算所有人都抽不到奖的情况：错排算法
    private static double show(int n) {
        if(n == 1) {
            return 0;
        }
        if(n == 2) {
            return 1;
        } else {
            return (n - 1) * (show(n-1)+ show(n-2));
        }
    }
    //计算阶乘：递归写法
    private  static double factorical(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorical(n-1);
    }
}