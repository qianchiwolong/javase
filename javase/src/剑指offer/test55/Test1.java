package 剑指offer.test55;



import java.util.LinkedList;
import java.util.List;

/**
 * @Author 陈豪
 * @Date 2021/4/16 11:07
 * @Version 1.0
 */

public class Test1 {

    //按层来遍历二叉树
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        List<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        List<TreeNode> tmp;
        int res = 0;
        while(!queue.isEmpty()) {
            tmp = new LinkedList<>();
            for(TreeNode node : queue) {
                if(node.left != null) {
                    tmp.add(node.left);
                    //System.out.println(node.left.val);
                }
                if(node.right != null) {
                    tmp.add(node.right);
                    //System.out.println(node.right.val);
                }
            }
            queue = tmp;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Test1 test=new Test1();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(1);
        root.right=new TreeNode(5);
        root.right.left=new TreeNode(4);
        System.out.println(test.maxDepth(root));
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

