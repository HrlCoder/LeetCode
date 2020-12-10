package 树.二叉树镜像;

class TreeNode {
    int val = 0;
    TreeNode left = null;
     TreeNode right = null;

    public TreeNode(int val) {
         this.val = val;
    }
 }

public class Solution {
    public void Mirror(TreeNode root) {
        if(root == null) {
            return;
        }
        if(root.right == null && root.left == null) {
            return;
        }

        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;

        if(root.left != null) {
            Mirror(root.left);
        }
        if(root.right != null) {
            Mirror(root.right);
        }
    }
}