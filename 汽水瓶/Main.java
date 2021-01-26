package 益智.汽水瓶;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author： 浪漫不死
 * @Date： 2020/8/11
 * @description：
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int num = sc.nextInt();
            if(num<1 || num>100){
                break;
            }
            int m = num / 3;
            int n = num % 3;
            int count = m;

            while(m > 0) {
                int t1 = m;
                int t2 = n;
                m = (t1+t2)/3;
                n = (t1+t2)%3;
                count += m;
            }
            if(m == 0 && n == 2) {
                count++;
            }
            System.out.println(count);
        }
    }
}
