package 剑指offer.test28;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 陈豪
 * @Date 2021/4/16 16:17
 * @Version 1.0
 */

public class Test {
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        List<TreeNode> list=new ArrayList<>();
        list.add(root);
        List<TreeNode> temp;
        while (!list.isEmpty()){
            temp=new ArrayList<>();
            for (TreeNode treeNode : list) {
                if (treeNode.left!=null)temp.add(treeNode.left);
                else temp.add(new TreeNode(-1));
                if (treeNode.right!=null)temp.add(treeNode.right);
                else temp.add(new TreeNode(-1));
            }
            int i=0,j=temp.size()-1;
            while (i<j){
                if (temp.get(i).val==temp.get(j).val){
                    i++;j--;
                }else return false;
            }
            list=temp;
            boolean falg=true;
            for (TreeNode treeNode : list) {
                if (treeNode.val!=-1) falg=false;
            }
            if (falg) break;
        }
        return true;
    }

    public boolean isSymmetric1(TreeNode root) {
        return root == null ? true : recur(root.left, root.right);
    }
    boolean recur(TreeNode L, TreeNode R) {
        if(L == null && R == null) return true;
        if(L == null || R == null || L.val != R.val) return false;
        return recur(L.left, R.right) && recur(L.right, R.left);
    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}