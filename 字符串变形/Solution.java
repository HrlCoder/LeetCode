package 字符串变形;

public class Solution {
    public static String trans(String s, int n) {
        char[] chars = s.toCharArray();
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for(char ch : chars){
            if(ch >= 97 && ch <= 122){
                temp.append((char)(ch-32));
            }else if(ch >=65 && ch <= 90){
                temp.append((char)(ch+32));
            }else{
                temp.insert(0, ch);
                res.insert(0,temp);
                temp = new StringBuilder();
            }
        }
        res.insert(0,temp);
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(trans("This is a sample", 16));
    }
}
