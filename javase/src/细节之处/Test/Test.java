package 细节之处.Test;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
     Test a=new Test();
     int [] nums={2, 7, 11, 15};

     int [] result=a.twoSum(nums,9);
        for (int s:result
             ) {
            System.out.println(s);
        }
    }
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int last=numbers.length-1;
        int []result=new int[2];
        //while(numbers[i]+numbers[last]==target)

            while (i<last) {
                if(numbers[i]+numbers[last]==target)
                {
                    result[0] = ++i;
                    result[1] = ++last;
                    return result;
                }else  if (numbers[i] + numbers[last] > target) last--;

                        else if (numbers[i] + numbers[last] < target) i++;

            }
        return null;




    }
    /*public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer>  map=new HashMap<>(16);
        for(int i=0;i<nums.length;i++)
        {

            if(map.containsKey(target-nums[i])){
             int []     result={map.get(target - nums[i]), i};//通过key的值来返回value 而value是数组的下标
             return  result;
            }
            map.put(nums[i],i);
    }
        return new int[0];
}*/

}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {} //无参构造
 *     ListNode(int val) { this.val = val; }//有参构造
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *  Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
 *         for (int i = 0; i < nums.length; ++i) {
 *             if (hashtable.containsKey(target - nums[i])) {
 *                 return new int[]{hashtable.get(target - nums[i]), i};
 *             }
 *             hashtable.put(nums[i], i);
 *         }
 *         return new int[0];
 *
 * 作者：LeetCode-Solution
 * 链接：https://leetcode-cn.com/problems/two-sum/solution/liang-shu-zhi-he-by-leetcode-solution/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
