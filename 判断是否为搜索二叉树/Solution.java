package 判断是否为搜索二叉树;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    /**
     *
     * @param root TreeNode类 the root
     * @return bool布尔型一维数组
     */
    long pre = Long.MIN_VALUE;
    public boolean[] judgeIt (TreeNode root) {
        // write code here
        return new boolean[]{isSBT(root),isCBT(root)};
    }

    /**
     * 判断一棵二叉树是否为搜索二叉树，只要改写一个二叉树中序遍历，在遍历的过程中看节点值是否都是递增的即可。
     * @param root
     * @return
     */
    public boolean isSBT(TreeNode root) {
        if (root == null) {
            return  true;
        }
        if(!isSBT(root.left)) {
            return false;
        }
        if (root.val <= pre) {
            return false;
        }
        pre = root.val;
        return isSBT(root.right);
    }

    /**
     *
     * 判断一棵二叉树是否为完全二叉树，依据以下标准会使判断过程变得简单且易实现。
     * 1．按层遍历二叉树，从每层的左边向右边依次遍历所有的节点。
     * 2．如果当前节点有右孩子节点，但没有左孩子节点，则直接返回 false。
     * 3．如果当前节点并不是左右孩子节点全有，那么之后的节点必须都为叶节点，否则返回false。
     * 4．遍历过程中如果不返回 false，则遍历结束后返回 true。
     * @param root
     * @return
     */
    public boolean isCBT(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leaf = false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                //如果当前节点并不是左右孩子节点全有，那么之后的节点必须都为叶节点
                if (leaf && (node.left != null || node.right != null)) {
                    return false;
                }
                //如果当前节点有右孩子节点，但没有左孩子节点，则直接返回 false
                if (node.left == null && node.right != null) {
                    return false;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                } else {
                    leaf = true;
                }
            }
        }
        return true;

    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}