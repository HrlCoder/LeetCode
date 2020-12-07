package 超长正整数相加;

import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String a = sc.next();
            String b = sc.next();
            System.out.println(AddLongInteger(a, b));
        }
    }
    public static String AddLongInteger(String addend,String augend) {
        BigInteger b1 = new BigInteger(addend);
        BigInteger b2 = new BigInteger(augend);
        BigInteger add = b1.add(b2);
        return add.toString();
    }
}
