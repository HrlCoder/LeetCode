package Fibonacci数列;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int a = 0;
            int b = 1;
            while (b<=n) {
                int temp = b+a;
                a = b;
                b = temp;
            }
            if((b-n)>(n-a)) {
                System.out.println(n-a);
            }else {

                System.out.println(b-n);
            }
        }
    }
}


class Solution1 {
    public int fib(int n) {
        return n < 2 ? n : (fib(n - 1) + fib(n - 2)) % (int)(1e9 + 7);
    }
}

class Soluntion2 {
    public int fib(int n) {
        int a = 0, b = 1, temp;
        for(int i = 0; i < n; i++){
            temp = (a + b) % 1000000007;
            a = b;
            b = temp;
        }
        return a;
    }
}
