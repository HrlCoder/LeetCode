package 字符串中找出连续最长的数字串;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author： 浪漫不死
 * @Date： 2020/11/25
 * @description：
 * @version: 1.0
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String newString = "";
            char[] ch = str.toCharArray();
            //将不为数字的字符转换成空格
            for(char c : ch) {
                if(c>='0' && c<='9') {
                    newString += c;
                } else {
                    newString += " ";
                }
            }
            //按空格分割
            String[] st = newString.split(" ");
            int max = 0;
            for(String s : st) {
                max = max > s.length() ? max : s.length();
            }
            for(String s : st) {
                if(s.length() == max) {
                    System.out.println(s);
                }
            }
        }
    }
}
