package n个数里最小的k个;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author： 浪漫不死
 * @Date： 2020/12/1
 * @description：
 * @version: 1.0
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            list.add(a);
        }
        int k = list.remove(list.size()-1);//得到k
        Collections.sort(list);
        for(int i=0;i<k;i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
