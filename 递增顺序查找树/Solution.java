package 树.递增顺序查找树;

public class Solution {
    static TreeNode current;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        current = ans;
        inTraversal(root);
        return ans.right;
    }

    public static void inTraversal(TreeNode root) {
        if(root != null) {
            inTraversal(root.left);
            root.left = null;
            current.right = root;
            current = root;
            inTraversal(root.right);
        }
    }
}

class Solution1 {
    TreeNode cur;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        cur = ans;
        inorder(root);
        return ans.right;
    }

    public void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        node.left = null;
        cur.right = node;
        cur = node;
        inorder(node.right);
    }
}
