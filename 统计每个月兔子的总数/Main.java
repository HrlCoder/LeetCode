package 益智.统计每个月兔子的总数;
import java.util.Scanner;
public class Main {
    public static int getTotalCount(int monthCount) {
        if(monthCount == 1 || monthCount == 2) {
            return 1;
        }
        return getTotalCount(monthCount-1)+getTotalCount(monthCount-2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            System.out.println(getTotalCount(a));
        }
    }
}
