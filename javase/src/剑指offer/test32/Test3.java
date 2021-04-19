package 剑指offer.test32;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author 陈豪
 * @Date 2021/4/19 16:15
 * @Version 1.0
 */

public class Test3 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
       /* int falg=1;
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null) queue.add(root);
        while(!queue.isEmpty()) {
            LinkedList<Integer> tmp = new LinkedList<>();
            for(int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if (falg%2==0) tmp.addFirst(node.val);
                else tmp.addLast(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);

            }
            res.add(tmp);
            falg++;
        }
        return res;
*/

       Deque<TreeNode> deque = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null) deque.add(root);
        while(!deque.isEmpty()) {
            // 打印奇数层
            List<Integer> tmp = new ArrayList<>();
            for(int i = deque.size(); i > 0; i--) {
                // 从左向右打印
                TreeNode node = deque.removeFirst();
                tmp.add(node.val);
                // 先左后右加入下层节点
                if(node.left != null) deque.addLast(node.left);
                if(node.right != null) deque.addLast(node.right);
            }
            res.add(tmp);
            if(deque.isEmpty()) break; // 若为空则提前跳出
            // 打印偶数层
            tmp = new ArrayList<>();
            for(int i = deque.size(); i > 0; i--) {
                // 从右向左打印
                TreeNode node = deque.removeLast();
                tmp.add(node.val);
                // 先右后左加入下层节点
                if(node.right != null) deque.addFirst(node.right);
                if(node.left != null) deque.addFirst(node.left);
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
