package 力扣.tets879;

/**
 * @Author 陈豪
 * @Date 2021/4/25 20:32
 * @Version 1.0
 */

public class Test {
   /* public TreeNode increasingBST(TreeNode root) {
        List<Integer> list=new LinkedList<>();
        FDS(root,list);
        TreeNode temp=new TreeNode(1);
        TreeNode curt=temp;

        for (Integer integer : list) {
            curt.right=new TreeNode(integer);
            curt=curt.right;
        }
        return temp.right;

    }
    private void FDS(TreeNode root, List<Integer> list){
        if (root==null) return;
        FDS(root.left,list);
        list.add(root.val);
        FDS(root.right,list);
    }*/
   private TreeNode resNode;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummyNode = new TreeNode(-1);
        resNode = dummyNode;
        inorder(root);
        return dummyNode.right;
    }

    public void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);

        // 在中序遍历的过程中修改节点指向
        resNode.right = node;
        node.left = null;
        resNode = node;

        inorder(node.right);
    }

}
class TreeNode {
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