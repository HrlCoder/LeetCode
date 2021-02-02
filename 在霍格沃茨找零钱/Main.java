package 益智.在霍格沃茨找零钱;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.next();
            String s2 = sc.next();
            String[] split1 = s1.split("\\.");
            String[] split2 = s2.split("\\.");
            int s1knut = ((Integer.valueOf(split1[0])*17 + Integer.valueOf(split1[1]))*29
                        + Integer.valueOf(split1[2]));
            int s2knut = ((Integer.valueOf(split2[0])*17 + Integer.valueOf(split2[1]))*29
                    + Integer.valueOf(split2[2]));
            int num = s2knut - s1knut;

            int knut =  num % 29;
            int sickle = num / 29 % 17;
            int galleon = num / 29 / 17;
            System.out.print(galleon+"."+Math.abs(sickle)+"."+Math.abs(knut));
        }
    }
}