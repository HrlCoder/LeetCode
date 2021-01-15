package 二叉搜索树的最近公共祖先;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == p || root == q) {
            return root;
        }

        boolean pInLeft = search(root.left,p);
        boolean qInLeft = search(root.left,q);

        if(pInLeft && qInLeft) {
            return lowestCommonAncestor(root.left,p,q);
        }

        if(!pInLeft && !qInLeft) {
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }

    private boolean search(TreeNode root, TreeNode t) {
        if(root == null) {
            return false;
        }
        if(root == t) {
            return true;
        }
        if(search(root.left,t)) {
            return true;
        }
        return search(root.right,t);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}