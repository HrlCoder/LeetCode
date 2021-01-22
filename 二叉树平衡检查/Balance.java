package 树.二叉树平衡检查;

public class Balance {
    public boolean isBalance(TreeNode root) {
        if(root == null) {
            return true;
        }
        //获取左子树，右子树的高度
        int left = treeDepth(root.left);
        int right = treeDepth(root.right);
        if(Math.abs(left - right) <= 1) {
            return isBalance(root.left) && isBalance(root.right);
        }
        return false;
    }

    public int treeDepth(TreeNode root) {
        if(root == null) return 0;
        int leftDepth = treeDepth(root.left);
        int rightDepth = treeDepth(root.right);
        return leftDepth > rightDepth ? leftDepth+1 : rightDepth+1;
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}