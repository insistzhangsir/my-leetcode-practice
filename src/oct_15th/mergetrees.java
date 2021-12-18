package oct_15th;

//合并两个树  即对应位置数值相加。
public class mergetrees {

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {   //深度优先遍历
        if(root1==null){
            return root2;
        }
        if(root2==null){
            return root1;
        }
        TreeNode mergenode =new TreeNode(root1.val+root2.val);
        mergenode.left=mergeTrees(root1.left,root2.left);
        mergenode.right=mergeTrees(root1.right,root2.right);
        return mergenode;
    }

    public static void bianli (TreeNode root){

        if (root!=null) {
            System.out.println("root.val = " + root.val);
            bianli(root.left);
            bianli(root.right);
        }
        return;
    }


    public static void main(String[] args) {
            TreeNode root4 = new TreeNode(5,null,null);
            TreeNode root3=new TreeNode(2,null,null);
            TreeNode root2=new TreeNode(3,root4,null);
            TreeNode root1=new TreeNode(1,root2,root3);
            TreeNode root5 = new TreeNode(7,null,null);
            TreeNode root6 = new TreeNode(4,null,null);
            TreeNode root7=new TreeNode(3,null,root5);
            TreeNode root8=new TreeNode(1,null,root6);
            TreeNode root9=new TreeNode(2,root8,root7);
            TreeNode noeds= mergeTrees(root1,root9);
            bianli(noeds);
    }




}
