import java.util.Scanner;

public class Test {
    //A10;S20;W10;D30;X;A1A;B10A11;;A10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            int x = 0;
            int y = 0;

            //按;分段
            String[] st = str.split(";");
            for (String s : st) {
                if(s == null) {
                    continue;
                }
                String num = s.substring(1);
                if(s.charAt(0) == 'A' && num.matches("[0-9]{1,2}")) {
                    x -= Integer.parseInt(num);
                }
                if(s.charAt(0) == 'D' && num.matches("[0-9]{1,2}")) {
                    x += Integer.parseInt(num);
                }
                if(s.charAt(0) == 'W' && num.matches("[0-9]{1,2}")) {
                    y += Integer.parseInt(num);
                }
                if(s.charAt(0) == 'S' && num.matches("[0-9]{1,2}")) {
                    y -= Integer.parseInt(num);
                }
            }
            System.out.println(x+","+y);
        }
    }

}
