package 剑指offer.test57;

import java.util.Arrays;

/**
 * @Author 陈豪
 * @Date 2021/4/9 20:48
 * @Version 1.0
 */

public class Test {
    public static int[] twoSum(int[] nums, int target) {

       /* for (int i = 0; i <nums.length&&nums[i]<target ; i++) {
            for (int j = i+1; j <nums.length&&nums[j]<=target-nums[i] ; j++) {
                if (nums[i]+nums[j]==target){
                    return new int[]{nums[i], nums[j]};
                }
            }
        }
        return null;*/
       int first =0;
       int last =nums.length-1;
       while (first<last){
           if (nums[first]+nums[last]==target){
               return new int[]{nums[first], nums[last]};
           }
           if (nums[first]+nums[last]>target){
               last--;
           }
           if (nums[first]+nums[last]<target){
               first++;
           }
       }
       return null;
    }

    public static void main(String[] args) {
        int[] nums={10,26,30,31,47,60};
        System.out.println(Arrays.toString(twoSum(nums,40)));
    }

}
