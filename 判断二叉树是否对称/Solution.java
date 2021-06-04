package 判断二叉树是否对称;


public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }
    public boolean check(TreeNode x, TreeNode y) {
        if(x == null && y == null) return true;
        if((x == null && y != null) || (x != null && y == null))
            return false;
        return x.val == y.val
                && check(x.left, y.right)
                && check(x.right, y.left);
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}