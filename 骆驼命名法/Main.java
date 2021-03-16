package 骆驼命名法;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str=sc.nextLine();
            String[] s=str.split("_");
            String newString=s[0];
            for(int i=1;i<s.length;i++){
                newString+=(char)(s[i].charAt(0)-'a'+'A');
                newString += s[i].substring(1);
//                for(int j=1;j<words[i].length();j++){
//                    result+=words[i].charAt(j);
//                }
            }
            System.out.println(newString);
        }
    }
}