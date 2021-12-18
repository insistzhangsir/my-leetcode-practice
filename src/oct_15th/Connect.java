package oct_15th;

//将给定一个 完美二叉树 ，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
//
//struct Node {
//  int val;
//  Node *left;
//  Node *right;
//  Node *next;
//}
//填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
//
//初始状态下，所有 next 指针都被设置为 NULL。

import java.util.LinkedList;
import java.util.Queue;

public class Connect {
    public static class  Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public static Node connect(Node root) {
        if(root==null){
            return null;
        }
        Queue<Node> queue =new LinkedList<Node>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int n=queue.size();
            for(int i=0;i<n;i++){
                Node node=queue.poll();
                node.next=queue.peek();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
        }

        return root;
    }


    public static void main(String[] args) {
        Node node1=new Node(7,null,null,null);
        Node node2=new Node(6,null,null,null);
        Node node3=new Node(5,null,null,null);
        Node node4=new Node(4,null,null,null);
        Node node5=new Node(3,node2,node1,null);
        Node node6=new Node(2,node4,node3,null);
        Node node7=new Node(1,node6,node5,null);
        connect(node7);
    }
}
