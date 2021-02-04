package 益智.球的半径和体积;

import java.util.Scanner;
public class Main {
    static double PI = Math.acos(-1);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int x0 = in.nextInt();
            int y0 = in.nextInt();
            int z0 = in.nextInt();
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int z1 = in.nextInt();
            double r = Math.sqrt((x0-x1)*(x0-x1)+(y0-y1)*(y0-y1)+(z0-z1)*(z0-z1));
            double v = 4.0/3*PI*r*r*r;
            System.out.printf("%.3f",r+" ");
            System.out.printf("%.3f",v);
            System.out.println();
            }
        }
    }
}
