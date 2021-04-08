package 二叉树的之字层序遍历;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        int flag = 1;
        if(root == null) return lists;
        queue.add(root);
        while (!queue.isEmpty()) {
            int cur = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < cur; i++) {
                TreeNode node = queue.remove();
                list.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            if(flag == 1) {
                lists.add(list);
            } else {
                Collections.reverse(list);
                lists.add(list);
            }
            flag = -flag;
        }
        return lists;
    }

}



class TreeNode {
  int val = 0;
  TreeNode left = null;
  TreeNode right = null;
}