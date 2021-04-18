package 剑指offer.test56;

import java.util.*;

/**
 * @Author 陈豪
 * @Date 2021/3/8 21:06
 * @Version 1.0
 */
/*一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。
请写程序找出这两个只出现一次的数字。
要求时间复杂度是O(n)，空间复杂度是O(1)。*/
public class test {
    public static int singleNumbers(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>(nums.length);
        for (int i=0;i<nums.length;i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else map.put(nums[i],map.get(nums[i])+1);
        }

        int res=-1;

        Object[] keys=map.keySet().toArray();
        for (int i=0;i<keys.length;i++){

            if (1==map.get(keys[i])){
                res= (int) keys[i];
            }
        }

        return res;

       /**
        * 统计数组中二进制表示是每位中1的总和放入数组
        *    3=0011
        *    3=0011
        *    3=0011
        *    5=0101
        *总和  0134 % 3 = 5
        int[] counts = new int[32];
        for(int num : nums) {
            for(int j = 0; j < 32; j++) {
                counts[j] += num & 1;
                num >>>= 1;
            }
        }
        int res = 0, m = 3;
        for(int i = 0; i < 32; i++) {
            res <<= 1;
            res |= counts[31 - i] % m;
        }
        return res;
    */
    }

    public static void main(String[] args) {
        int[] a={3,4,3,3};
        System.out.println(singleNumbers(a));
    }
}
