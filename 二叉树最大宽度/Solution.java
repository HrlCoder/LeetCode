package 树.二叉树最大宽度;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author： 浪漫不死
 * @Date： 2021/1/15
 * @description：
 * @version: 1.0
 */

/**
 * 按照深度优先的顺序，我们记录每个节点的 position 。对于每一个深度，第一个到达的位置会被记录在 left[depth] 中。
 * 然后对于每一个节点，它对应这一层的可能宽度是 pos - left[depth] + 1 。我们将每一层这些可能的宽度去一个最大值就是答案。
 */
class Solution1 {
    int ans;
    Map<Integer, Integer> left;
    public int widthOfBinaryTree(TreeNode root) {
        ans = 0;
        left = new HashMap();
        dfs(root, 0, 0);
        return ans;
    }
    public void dfs(TreeNode root, int depth, int pos) {
        if (root == null) return;
        left.computeIfAbsent(depth, x-> pos);
        ans = Math.max(ans, pos - left.get(depth) + 1);
        dfs(root.left, depth + 1, 2 * pos);
        dfs(root.right, depth + 1, 2 * pos + 1);
    }
}

class Solution3 {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        // 根节点编号为 0
        root.val = 0;
        queue.add(root);

        int sum;
        int ans = 0;
        while(!queue.isEmpty()) {
            sum = queue.size();
            // 队头和队尾的编号值求差用来更新宽度
            ans = Math.max(ans, queue.getLast().val - queue.getFirst().val + 1);
            // 一次处理一层，进入这个循环前队列中是一层的所有非空节点
            while(sum > 0) {
                TreeNode temp = queue.remove();

                // 子节点入队前修改 val, val = 满二叉树中节点编号
                if(temp.left != null) {
                    queue.add(temp.left);
                    temp.left.val = temp.val * 2 + 1;
                }
                if(temp.right != null) {
                    queue.add(temp.right);
                    temp.right.val = temp.val * 2 + 2;
                }
                sum--;
            }
        }
        return ans;
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