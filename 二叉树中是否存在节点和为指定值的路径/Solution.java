package 二叉树中是否存在节点和为指定值的路径;

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;

        sum -= root.val;
        if (sum == 0 && root.left == null && root.right == null)
            return true;

        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}