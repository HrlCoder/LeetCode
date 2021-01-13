package 树.二叉树的后序遍历;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root != null) {

            List<Integer> leftlist = postorderTraversal(root.left);
            list.addAll(leftlist);

            List<Integer> rightlist = postorderTraversal(root.right);
            list.addAll(rightlist);

            list.add(root.val);
        }
        return list;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}