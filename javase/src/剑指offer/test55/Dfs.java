package 剑指offer.test55;

import java.util.HashMap;

/**
 * @Author 陈豪
 * @Date 2021/4/16 15:18
 * @Version 1.0
 */

public class Dfs {

    //前序
    public void preOrder(TreeNode root){
        System.out.println(root.val);
        //递归左子树
        if (root.left!=null){
            preOrder(root.left);
        }
        //递归右子树
        if (root.right!=null){
            preOrder(root.right);
        }
    }
    //中序
    public void infixOrder(TreeNode root){

        //递归左子树
        if (root.left!=null){
            infixOrder(root.left);
        }
        System.out.println(root.val);
        //递归右子树
        if (root.right!=null){
            infixOrder(root.right);
        }
    }
    //后序
    public void lastOrder(TreeNode root){
        if (root.left!=null){
            lastOrder(root.left);
        }
        //递归右子树
        if (root.right!=null){
            lastOrder(root.right);
        }
        System.out.println(root.val);

    }

    /*
     *         3
     *       /   \
     *      1      5
     *     / \    /
     *    2   -2  4
     *             \
     *              6
     * */

    public static void main(String[] args) {
        Dfs test= new Dfs();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(1);
        root.left.right=new TreeNode(2);
        root.left.left=new TreeNode(-2);
        root.right=new TreeNode(5);
        root.right.left=new TreeNode(4);
        root.right.left.right=new TreeNode(6);
        test.preOrder(root);
    }
}
