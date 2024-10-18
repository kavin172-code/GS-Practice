public class BinaryTree {
    TreeNode root;
    public void inOrderTraversal(TreeNode node){
      if(node!=null){
          inOrderTraversal(node.left);
          System.out.println(node.val+" ");
          inOrderTraversal(node.right);
      }

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree. root.left = new TreeNode(2);
        tree. root.right = new TreeNode(3);

      tree.root.left.left = new TreeNode(4);
       tree. root.left.right = new TreeNode(5);

       tree.root.right.left = new TreeNode(6);
       tree. root.right.right = new TreeNode(7);

    }
}
class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val){
        this.left = right=null;
        this.val = val;
    }
}
