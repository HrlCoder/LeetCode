package 乒乓球筐;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            boolean flag = true;
            StringBuffer input = new StringBuffer(sc.next());
            char[] find = sc.next().toCharArray();
            for (char c : find) {
                int index = input.indexOf(String.valueOf(c));
                if (index != -1) {
                    input.deleteCharAt(index);
                }else {
                    System.out.println("No");
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("Yes");
            }
        }
    }
}
