package 计算日期到天数转换;

import java.util.Scanner;

public class Main {
    static int[] lastnum = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static int iConverDateToDay(int year,int month,int day) {

        //判断是不是闰年,是闰年2月就29天
        if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
            lastnum[1] = 29;
        } else {
            lastnum[1] = 28;
        }
        //排除错误
        if(year <= 0 || month <= 0 || month > 12 || day <= 0 || day > lastnum[month-1] ) {
            return -1;
        }
        return 0;
    }

    public static int getOutDay(int year,int month,int day) {
        int n = iConverDateToDay(year, month, day);
        if(n == 0) {
            int sum = 0;
            for (int i = 0; i < month-1; i++) {
                sum += lastnum[i];
            }

            return sum+day;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            System.out.println(getOutDay(year, month, day));
        }
    }
}

