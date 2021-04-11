import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class reversalString {
    public static void main(String[] args) {
        String s = "1234";
        show01(s);
        show02(s);
        show03(s);
        show04(s);
        System.out.println(show05(s));
    }

    /**
     * 递归思想
     */
    private static String show05(String s) {
        //递归终止条件
        if(s == null || s.length() <= 1) {
            return s;
        }
        //递归每次从1索引切割的字符串，并且连接上0索引的字符
        //1234  ->  234+1   ->  34+21   ->4+321
        return show05(s.substring(1))+s.charAt(0);
    }

    /**
     * 利用栈先进后出的特性反转字符串
     */
    private static void show04(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    /**
     * 利用StringBuffer的方法反转字符串
     */
    private static void show03(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        stringBuffer.reverse().toString();
        System.out.println(stringBuffer);
    }

    /**
     * 利用Collections的方法逆序链表反转字符串
     */
    private static void show02(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        Collections.reverse(list);
        for (Character character : list) {

            System.out.print(character);
        }
        System.out.println();
    }

    /**
     * 逆序打印char型数组的方式反转字符串的每一个元素
     */
    private static void show01(String s) {
        char[] chars = s.toCharArray();
        String newStr = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            newStr += chars[i];
        }
        System.out.println(newStr);
    }
}
