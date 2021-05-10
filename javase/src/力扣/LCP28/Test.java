package 力扣.LCP28;

import java.util.Arrays;

/**
 * @Author 陈豪
 * @Date 2021/5/3 21:36
 * @Version 1.0
 */

public class Test {
    public static   int purchasePlans(int[] nums, int target) {
      /*  long res=0l;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]+nums[j]<=target) res++;
            }
        }
        res=res%1000000007;
        return (int) res;*/



        /*

        int mod = 1_000_000_007;
        int ans = 0;
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] > target) right--;
            else {
                ans += right - left;
                left++;
            }
            ans %= mod;
        }
        return ans % mod;*/

      int res=0;
        Arrays.sort(nums);
        int first=0;
        int last=nums.length-1;
        while (first<last){
            if (nums[first]+nums[last]>target) last--;
            else  {
                res+=(last-first)%1000000007;
                first++;
            }
        }
        return  res%1000000007;

    }

    public static void main(String[] args) {
        int [] a={2,5,3,5};
        System.out.println( purchasePlans(a,6));
    }

}
