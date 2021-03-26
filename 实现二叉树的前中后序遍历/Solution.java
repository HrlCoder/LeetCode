package 实现二叉树的前中后序遍历;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> pre = new ArrayList<>();
    List<Integer> in = new ArrayList<>();
    List<Integer> post = new ArrayList<>();

    public int[][] threeOrders (TreeNode root) {
        if(root == null) {
            return new int[][]{{}};
        }
        List<List<Integer>> list = new ArrayList<>();
        preOrder(root);
        inOrder(root);
        postOrder(root);
        list.add(pre);
        list.add(in);
        list.add(post);
        int[][] arr = new int[list.size()][list.get(0).size()];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(0).size(); j++) {
                arr[i][j] = list.get(i).get(j);
            }
        }
        return arr;
    }

    private void postOrder(TreeNode root) {
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            post.add(root.val);
        }
    }

    private void inOrder(TreeNode root) {
        if(root != null) {
            inOrder(root.left);
            in.add(root.val);
            inOrder(root.right);
        }
    }

    private void preOrder(TreeNode root) {
        if(root != null) {
            pre.add(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}

class TreeNode {
  int val = 0;
  TreeNode left = null;
  TreeNode right = null;
}
