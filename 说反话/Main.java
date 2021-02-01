package 字符串.说反话;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            String[] s = str.split(" ");
            String newstr = "";
            for (int i = s.length - 1; i >= 0; i--) {
                if(i == 0) {
                    newstr += s[i];
                } else {
                    newstr += s[i]+" ";
                }
            }
            System.out.print(newstr);
        }
    }
}
