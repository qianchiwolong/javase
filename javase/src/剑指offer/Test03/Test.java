package 剑指offer.Test03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**剑指 Offer 03. 数组中重复的数字

 找出数组中重复的数字。


 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

 示例 1：

 输入：
 [2, 3, 1, 0, 2, 5, 3]
 输出：2 或 3
*/
 public class Test {
    public static int findRepeatNumber(int[] nums) {

//       List<Integer> list=new ArrayList<>(nums.length);
//       for (int i=0;i<nums.length;i++)
//       {
//           if (list.contains(nums[i])) return nums[i];
//           else list.add(nums[i]);
//       }
//       return 0;
        int res=-1;
        Set<Integer> set=new HashSet<>();
        for (int i=0;i<nums.length;i++)
        {
            if (!set.add(nums[i])){ res=nums[i];
             break;}
        }
        return res;
        }

    public static void main(String[] args) {
        int [] a={0, 1, 2, 3, 4, 1, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(findRepeatNumber(a));
    }
    }

