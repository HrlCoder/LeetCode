package 输入二叉树的右视树;

import java.util.*;
public class Solution {
    public int[] solve (int[] xianxu, int[] zhongxu) {
        // write code here
        //先逆向推导出二叉树
        TreeNode root = reBuild(xianxu,zhongxu);
        //层序遍历二叉树,收集每一层的最右边的元素值
        return rigthView(root);
    }


    public TreeNode reBuild (int[] preOrder, int[] inOrder) {
        //递归结束条件,为什么这里只校验preOrder,而没有校验inOder呢?理论上也是要校验inOrder的
        if(preOrder == null || preOrder.length == 0 ){
            return null;
        }
        // 取根节点
        int val = preOrder[0];
        TreeNode root = new TreeNode(val);
        int pos = 0;
        //找到根节点在inOrder中的位置
        for(;pos<inOrder.length;pos++){
            if(inOrder[pos] == val){
                break;
            }
        }
        //递归获取左子树
        //传递的参数中,前序遍历数组为什么也能用pos进行分割呢?
        //无论是中序数组的根节点所在的位置是左右子树的分界点,在前序数组中也同样是左右子树的分界点
        root.left = reBuild(Arrays.copyOfRange(preOrder,1,pos+1),
                Arrays.copyOfRange(inOrder,0,pos));
        //递归获取右子树
        root.right = reBuild(Arrays.copyOfRange(preOrder,pos+1,preOrder.length),
                Arrays.copyOfRange(inOrder,pos+1,inOrder.length));

        return root;
    }

    public int[] rigthView(TreeNode node){

        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            int rightVal = 0;
            for(int size = queue.size();size > 0;size--){
                TreeNode tmp = queue.poll();
                rightVal = tmp.val;
                if(tmp.left != null){
                    queue.offer(tmp.left);
                }
                if(tmp.right != null){
                    queue.offer(tmp.right);
                }
            }
            list.add(rightVal);
        }

        int[] ans = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
