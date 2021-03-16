package 单词倒排中级;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            char[] c = str.toCharArray();
            String ss = "";
            for (int i = 0; i < c.length; i++) {
                if((c[i]>='a' && c[i] <='z') ||(c[i]>='A' && c[i] <='Z')){
                    ss += c[i];
                } else {
                    ss += " ";
                }
            }
            String[] s = ss.trim().split(" ");
            String newString = "";
            for(int i = s.length-1; i >= 0; i--) {
                if(i != 0) {
                    newString += s[i]+" ";
                } else {
                    newString += s[i];
                }
            }
            System.out.println(newString);
        }
    }
}