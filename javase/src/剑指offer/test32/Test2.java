package 剑指offer.test32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author 陈豪
 * @Date 2021/4/19 16:04
 * @Version 1.0
 */

public class Test2 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        /*if (root == null) {
            return new LinkedList<>();
        }
        List<List<Integer>> reslist=new LinkedList<>();
        List<Integer> temp;
        Queue<TreeNode> queue=new LinkedList<>();
        Queue<TreeNode> nodetemp;
        queue.add(root);
        while (!queue.isEmpty()){
            nodetemp=new LinkedList<>();
            temp=new LinkedList<>();
            for (TreeNode node : queue) {
                temp.add(node.val);
                if (node.left!=null) nodetemp.add(node.left);
                if (node.right != null) nodetemp.add(node.right);
            }
            reslist.add(temp);
            queue=nodetemp;
        }
        return reslist;*/
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null) queue.add(root);
        while(!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for(int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            res.add(tmp);
        }
        return res;
    }

    public static void main(String[] args) {
        Test test=new Test();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(1);
        root.left.right=new TreeNode(8);

        root.right=new TreeNode(5);
        root.right.left=new TreeNode(4);
        root.right.left.right=new TreeNode(4);
        System.out.println(levelOrder(root));
    }
}
