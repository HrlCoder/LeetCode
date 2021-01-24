package 益智.组个最小数;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int[] array = new int[10];
            for (int i = 0; i < 10; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println(method(array));
        }
    }

    private static String method(int[] array) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i<array.length;i++) {
            while (array[i] != 0) {
                sb.append(i);
                array[i] = array[i] -1;
            }
        }
        for (int j = 0; j < array[0]; j++) {
            sb.insert(1,"0");
        }
        return sb.toString();
    }
}