package 力扣.test872;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 陈豪
 * @Date 2021/5/10 9:06
 * @Version 1.0
 */

public class Test {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1==null||root2==null) return false;
        List<Integer> root1list=new ArrayList<>();
        List<Integer> root2list=new ArrayList<>();
        dfs(root1,root1list);
        dfs(root2,root2list);
        if (root1list.size()!=root2list.size()) return false;
        for (int i = 0; i <root1list.size(); i++) {
            if (root1list.get(i)!=root2list.get(i))return false;
        }
        return true;
    }

    private void dfs(TreeNode root,List<Integer> list){
        if (root.left!=null) dfs(root.left,list);
        if (root.right!=null) dfs(root.right,list);
        if (root.right==null&&root.left==null) list.add(root.val);
    }

    public static void main(String[] args) {
        TreeNode root1=new TreeNode();
        root1.left=new TreeNode(2);
        root1.right=new TreeNode(6);
        TreeNode root2=new TreeNode();
        root2.left=new TreeNode();
        root2.left.right=new TreeNode(2);
        root2.right=new TreeNode(6);
        Test test=new Test();
        test.leafSimilar(root1,root2);
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