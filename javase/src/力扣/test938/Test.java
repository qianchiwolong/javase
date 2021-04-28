package 力扣.test938;


import java.util.List;

/**
 * @Author 陈豪
 * @Date 2021/4/27 20:25
 * @Version 1.0
 */

public class Test {
    public int rangeSumBST(TreeNode root, int low, int high) {
       /* if (root==null) return 0;
        List<Integer> list=new ArrayList<>();
        DFS(root,list);
        int sum=0;
        int fiest=0,last=list.size()-1;
        while (true){
            if (list.get(fiest)!=low) fiest++;
            if (list.get(last)!=high) last--;
            if (list.get(fiest)==low&&list.get(last)==high) break;
        }

        for (; fiest <=last ; fiest++) {
            sum+=list.get(fiest);
        }
return sum;*/
        if (root == null) {
            return 0;
        }
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
    private void DFS(TreeNode root,List<Integer> list){
        if (root==null) return;
        DFS(root.left,list);
        list.add(root.val);
        DFS(root.right,list);
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