package 最大公约数;

public class Solution {
    public static int gcd (int a, int b) {
        //辗转相除法
//         int result = 0;
//         while(b != 0){
//             result = a % b;
//             a = b;
//             b = result;
//         }
//         return result;
        //更相减损术
        while(a != b){
            if(a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
        //暴力破解
//         int min = a >= b ? b : a;
//         int max = a + b - min;
//         if(min == 0)
//             return 0;
//         if(max % min == 0)
//             return min;
//         for(int i = min; i > 0; i--)
//             if(min % i == 0 && max % i == 0)
//                 return i;
//         return 1;
    }

    public static void main(String[] args) {
        System.out.println(gcd(6, 3));
    }
}
