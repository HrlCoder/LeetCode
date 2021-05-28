package 判断回文;

public class Solution {
    public boolean judge (String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
