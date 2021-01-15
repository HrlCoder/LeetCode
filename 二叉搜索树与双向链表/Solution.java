package 二叉搜索树与双向链表;

public class Solution {
    private Node head;//链表头结点
    private Node last;//当前链表的最后一个结点

    //不创建新节点
    private void add(Node node) {
        if(last == null) {
            head = node;
        } else {
            last.right = node;
        }
        node.left = last;
        last = node;
    }

    //创建新节点
    private void add2(Node node) {
        Node newnode = new Node(node.val);

        if(last == null) {
            head = newnode;
        } else {
            last.right = newnode;
        }
        newnode.left = last;
        last = newnode;
    }

    private void inOrder(Node node) {
        if(node != null) {
            inOrder(node.left);
            add(node);
            inOrder(node.right);
        }
    }

    public Node treeToDoublyList(Node root) {
        head = last = null;
        inOrder(root);
        return head;
    }
}

class Solution1 {
    Node pre, head;
    public Node treeToDoublyList(Node root) {
        if(root == null) return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    void dfs(Node cur) {
        if(cur == null) return;
        dfs(cur.left);
        if(pre != null) pre.right = cur;
        else head = cur;
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }
}

class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
    }
}