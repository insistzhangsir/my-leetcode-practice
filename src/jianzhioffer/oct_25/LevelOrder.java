package jianzhioffer.oct_25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
//    3
//   / \
//  9  20
//    /  \
//   15   7
//        例如:
//        给定二叉树: [3,9,20,null,null,15,7],

public class LevelOrder {

    public static class TreeNode {
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret=new ArrayList<>();
        if(root==null){
            return ret;
        }
        Queue<TreeNode> queue =new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> cell=new ArrayList<>();
            int n=queue.size();
            for (int i = 0; i <n ; i++) {
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }if(node.right!=null) {
                    queue.offer(node.right);
                }
                cell.add(node.val);
            }
            ret.add(new ArrayList<>(cell));
        }
        System.out.println(ret);
        return ret;

    }


    public static void main(String[] args) {
        TreeNode root5 = new TreeNode(15);
        TreeNode root4 = new TreeNode(7);
        TreeNode root3 = new TreeNode(20);
        root3.left=root5;root3.right=root4;
        TreeNode root2 = new TreeNode(9);
        TreeNode root1 = new TreeNode(3);
        root1.left=root2;root1.right=root3;
        levelOrder(root1);
    }

}
