package 删除公共字符;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author： 浪漫不死
 * @Date： 2020/11/27
 * @description：
 * @version: 1.0
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            for(int i=0;i<s2.length();i++) {
                s1 = s1.replaceAll(s2.charAt(i)+"","");
            }
            System.out.println(s1);
        }
    }
}
