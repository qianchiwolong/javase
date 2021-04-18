package 剑指offer.Test42;

/**
 *输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *  *  *
 * 要求时间复杂度为O(n)。
 *
 *
 *
 * 示例1:
 *
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 */
public class Test {
    public static int maxSubArray(int[] nums) {
     /*   int maxsum=Integer.MIN_VALUE;

        for (int i = 0; i <nums.length ; i++) {
            int sum=0;
            for (int j = i; j <nums.length ; j++) {
                sum+=nums[j];
                maxsum=maxsum>sum?maxsum:sum;
            }

        }
        return maxsum;*/
       /* int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;*/
       if (nums.length<2) return nums[0];
       int res=Integer.MIN_VALUE;
       int[] dp=new int[nums.length+1];
       dp[0]=res;

        for (int i = 1; i <dp.length ; i++) {
            if (dp[i-1]>=0){
                dp[i]=dp[i-1]+nums[i-1];
            }else dp[i]=nums[i-1];
        }
        for (int i = 0; i <dp.length ; i++) {
            res=res>dp[i]?res:dp[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
    }
}
