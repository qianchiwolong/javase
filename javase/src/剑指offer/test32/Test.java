package 剑指offer.test32;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author 陈豪
 * @Date 2021/4/19 11:04
 * @Version 1.0
 */

public class Test {
    public int[] levelOrder(TreeNode root) {
      /*  if(root == null) return new int[0];
        List<Integer> list=new ArrayList<>();
        list.add(root.val);
        List<TreeNode> queue=new ArrayList<>();
        queue.add(root);
        List<TreeNode> temp;
        while (!queue.isEmpty()){
            temp=new ArrayList<>();
            for (TreeNode treeNode : queue) {
                if (treeNode.left!=null){
                    temp.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    temp.add(treeNode.right);
                }
            }
            for (int i = 0; i <temp.size() ; i++) {
                list.add(temp.get(i).val);
            }
            queue=temp;
        }
        int[] res=new int[list.size()];
        res=list.stream().mapToInt(Integer::intValue).toArray();
        return res;*/

        if(root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<TreeNode>(){{ add(root); }};
        ArrayList<Integer> ans = new ArrayList<>();
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            ans.add(node.val);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        int[] res = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
            res[i] = ans.get(i);
        return res;
    }



    /*
    *      3
    *    1   5
    *       4
    *         4
    * */
    public static void main(String[] args) {
        Test test=new Test();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(1);
        root.left.right=new TreeNode(8);

        root.right=new TreeNode(5);
        root.right.left=new TreeNode(4);
        root.right.left.right=new TreeNode(4);
        System.out.println(Arrays.toString(test.levelOrder(root)));
    }



}



class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}