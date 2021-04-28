package 力扣.test987;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 陈豪
 * @Date 2021/4/20 14:43
 * @Version 1.0
 */

public class Test {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer,List<Integer>>  map=new HashMap<>();



        return null;
    }

    public static void main(String[] args) {

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