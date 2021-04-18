package 剑指offer.Test39;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。



你可以假设数组是非空的，并且给定的数组总是存在多数元素。



示例 1:

输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
输出: 2
*/
public class Test {
    public int majorityElement(int[] nums) {
      //方法一
        /*  Arrays.sort(nums);
        return nums[nums.length/2];*/
        //方法二
       /* Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                int temp = map.get(nums[i]);
                map.put(nums[i], temp+1);
            }else map.put(nums[i],1);
        }
        for(Integer i : map.keySet()){
            if(map.get(i) > nums.length/2)
                return i;
        }
        return 0;*/
       //方法三 投票法
        int x = 0, votes = 0;
        for(int num : nums){
            if(votes == 0) x = num;
            votes += num == x ? 1 : -1;
        }
        return x;

        /*
        int x1=0,votes1=0;
        for (int i=0;i<nums.length;i++){
            if (votes1==0) x1=nums[i];
            votes1 = votes1 + nums[i]==x?1:-1;
        }*/
        /**
         * 摩尔投票法：
         *
         *     设输入数组 nums 的众数为x ，数组长度为 n 。
         *
         * 推论一： 若记 众数 的票数为 +1 ，非众数 的票数为 −1 ，则一定有所有数字的 票数和 >0 。
         *
         * 推论二： 若数组的前 a 个数字的 票数和 =0= 0=0 ，则 数组剩余 (n−a) 个数字的 票数和一定仍 >0 ，即后 (n−a) 个数字的 众数仍为 x 。
         *
         * */

    }
}
