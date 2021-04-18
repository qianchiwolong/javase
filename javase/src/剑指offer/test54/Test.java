package 剑指offer.test54;

/**
 * @Author 陈豪
 * @Date 2021/4/16 9:56
 * @Version 1.0
 */

public class Test {
    int res,k;
    public int kthLargest(TreeNode root, int k) {
        this.k=k;
        dfs(root);
        return res;
    }
    void dfs(TreeNode root){
        if(root ==null) return;
        dfs(root.right);//右递归
        System.out.println(root.val);
       /* if (k==0) return;
        else {
            k--;
            res=root.val;
        }*/
        dfs(root.left);//左递归
    }


    /*
    *        3
    *       / \
    *      1   5
    *          /
    *         4
    * */
    public static void main(String[] args) {
        Test test=new Test();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(1);
        root.right=new TreeNode(5);
        root.right.left=new TreeNode(4);
        System.out.println(test.kthLargest(root,2)+"==========");
    }
}


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }