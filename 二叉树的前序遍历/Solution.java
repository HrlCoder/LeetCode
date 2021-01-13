package 树.二叉树的前序遍历;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root != null) {

            list.add(root.val);

            List<Integer> leftlist = preorderTraversal(root.left);
            list.addAll(leftlist);

            List<Integer> rightlist = preorderTraversal(root.right);
            list.addAll(rightlist);
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