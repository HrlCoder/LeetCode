package 树.根据二叉树创建字符串;

public class Solution {
    public String tree2str(TreeNode t) {
        if(t == null) {
            return "";
        }
        if(t.right == null && t.left == null) {
            return t.val+"";
        }
        if(t.right == null) {
            return t.val+"("+tree2str(t.left)+")";
        }
        return t.val+"("+tree2str(t.left)+")"+"("+tree2str(t.right)+")";
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}