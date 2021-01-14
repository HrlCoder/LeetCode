package 树.二叉树的层序遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    static class NL {
        TreeNode node;
        int level;

        NL(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        if(root == null) {
            return new ArrayList<>();
        }

        Queue<NL> queue = new LinkedList<>();
        queue.add(new NL(root,0));

        while (!queue.isEmpty()) {
            NL nl = queue.remove();
            TreeNode node = nl.node;
            int level = nl.level;
            //控制放到哪个list，以及是否需要新创建内侧list
            if(level == list.size()) {
                list.add(new ArrayList<>());
            }
            List<Integer> innerList = list.get(level);
            innerList.add(node.val);

            if(node.left != null) {
                queue.add(new NL(node.left,level+1));
            }
            if(node.right != null) {
                queue.add(new NL(node.right,level+1));
            }
        }
        return list;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}