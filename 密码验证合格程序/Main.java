package 益智.密码验证合格程序;

import java.util.Scanner;
public class Main {
    public static boolean checkLength(String password){
        if (password==null || password.length()<=8)
            return false;
        return true;
    }

    public static boolean checkCharKinds(String password){
        int Digit=0,lowercase=0,uppercase=0,others=0;
        char[] ch = password.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>='0'&&ch[i]<='9') {
                Digit=1;
                continue;
            }
            else if (ch[i]>='a'&&ch[i]<='z') {
                lowercase=1;
                continue;
            }
            else if (ch[i]>='A'&&ch[i]<='Z') {
                uppercase=1;
                continue;
            }else {
                others=1;
                continue;
            }
        }
        int total = Digit+lowercase+uppercase+others;
        return total>=3 ? true : false;
    }

    public static boolean checkCharRepeat(String password){
        for(int i=0 ;i<password.length()-2 ;i++){
            String substr1 =password.substring(i, i+3);
            if (password.substring(i+1).contains(substr1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String psw = sc.nextLine();
            if (checkLength(psw)&&checkCharKinds(psw)&&checkCharRepeat(psw))
                System.out.println("OK");
            else
                System.out.println("NG");
        }
    }
}
