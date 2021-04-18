package 剑指offer.test55;

/**
 * @Author 陈豪
 * @Date 2021/4/16 14:26
 * @Version 1.0
 */

public class Test2 {
    public boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        //dfs(root.right);
        //dfs(root.right);
        return Math.abs(dfs(root.left) - dfs(root.right)) <= 1; // && isBalanced(root.left) && isBalanced(root.right);
}
    int dfs(TreeNode root){
        if (root!=null){
            return Math.max(dfs(root.left),dfs(root.right))+1;
        }else return 0;
    }


    public static void main(String[] args) {
        Test2 test=new Test2();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(1);
        root.right=new TreeNode(5);
        root.right.left=new TreeNode(4);
        root.right.left.right=new TreeNode(4);

        System.out.println(test.isBalanced(root));
    }

}
