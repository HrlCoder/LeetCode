package 字符串加解密;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(Encrypt(s1));
            System.out.println(unEncrypt(s2));
        }
    }
    //加密
    public static String Encrypt(String s) {
        char[] chars = s.toCharArray();
        String newString = "";
        for (char c : chars) {
            if(c >= 'a' && c < 'z') {
                c -= 31;
            } else if(c >= 'A' && c < 'Z') {
                c += 33;
            } else if(c == 'Z') {
                c = 'a';
            } else if(c == 'z'){
                c = 'A';
            } else if(c >= '0' && c < '9'){
                c += 1;
            } else if(c == '9') {
                c = '0';
            }
            newString += c;
        }
        return newString;
    }
    //解密
    public static String unEncrypt(String s) {
        char[] chars = s.toCharArray();
        String newString = "";
        for (char c : chars) {
            if(c > 'a' && c <= 'z') {
                c -= 33;
            } else if(c > 'A' && c <= 'Z') {
                c += 31;
            } else if(c == 'A') {
                c = 'z';
            } else if(c == 'a'){
                c = 'Z';
            } else if(c > '0' && c <= '9'){
                c -= 1;
            } else if(c == '0') {
                c = '9';
            }
            newString += c;
        }
        return newString;
    }
}
