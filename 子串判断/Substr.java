package 字符串.子串判断;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author： 浪漫不死
 * @Date： 2021/1/18
 * @description：
 * @version: 1.0
 */
public class Substr {
    public static boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] arr = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(s.contains(p[i])) {
                arr[i] = true;
            } else {
                arr[i] = false;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] p = {"a","b","c","d"};
        boolean[] result = chkSubStr(p, 4, "abc");
        System.out.println(Arrays.toString(result));
    }
}
