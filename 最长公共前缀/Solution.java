package 最长公共前缀;

public class Solution {
    //startsWith(String prefix)
    //测试这个字符串是否以指定的前缀开始。
    public static String longestCommonPrefix (String[] strs) {
        if(strs.length == 0) return "";
        String newStr = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(!newStr.equals("") && !strs[i].startsWith(newStr)) {
                newStr = newStr.substring(0,newStr.length()-1);//只要不匹配，就减小pre
            }
            if(newStr.equals("")) break;
        }
        return newStr;
    }

    public static void main(String[] args) {
        String[] strs = {"abca","abc","abca","abc","abcc"};
        System.out.println(longestCommonPrefix(strs));
    }
}
