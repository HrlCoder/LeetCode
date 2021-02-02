package 益智.二的个数;

public class Count2 {
    public static int countNumberOf2s(int n) {
        int count = 0;
        String s = "";
        for(int i =0;i < n+1;i++) {
            s += i;
        }

        char[] arr = s.toCharArray();
        for (char c : arr) {
            if(c == '2') count++;
        }
        return count;
    }

    public static int countNumberOf2s1(int n) {
        int count = 0;
        for (int i = 0,j = 0; j <= n; i++,j++) {
            i = j;
            while (i > 0) {
                if(i % 10 == 2) {
                    count++;
                }
                i /= 10;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countNumberOf2s1(2000));
    }
}