package 树.二叉树的完全性检验;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isCompleteTree(TreeNode root) {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        TreeNode node = null;
        while (!queue.isEmpty()) {
            node = queue.peek();
            if(node.left != null) {
                queue.add(node.left);
            } else {
                break;
            }
            if(node.right != null) {
                queue.add(node.right);
            } else {
                break;
            }
            queue.poll();
        }
        if(queue.peek().right == null) {
            queue.poll();
        }
        while (!queue.isEmpty()){
            node = queue.poll();
            if(node.left != null || node.right != null){
                return false;
            }
        }
        return true;
    }
}
