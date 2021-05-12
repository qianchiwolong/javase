package 力扣.test376;

/**
 * @Author 陈豪
 * @Date 2021/5/10 14:26
 * @Version 1.0
 */

public class Test {
    public static int wiggleMaxLength(int[] nums) {
     /*   if (nums.length<3) {
            if (nums.length>1&&nums[0]==nums[1]) return 1;
            else return nums.length;
        }
        int[] dp=new int[nums.length];
        dp[0]=1;
        if (nums[0]!=nums[1]) dp[1]=2;
        else dp[1]=1;
        for (int i = 2; i <nums.length ; i++) {
            int firstreduce=nums[i-1]-nums[i-2];
            int reduce=nums[i]-nums[i-1];
            if ((firstreduce<=0&&reduce>0)||(firstreduce>=0&&reduce<0)){
                dp[i]=dp[i-1]+dp[i]+1;
            }else dp[i]=dp[i-1];
        }
        int res=Integer.MIN_VALUE;
        for (int i : dp) {
            res=res>i?res:i;
        }
        return res;*/
        int n = nums.length;
        if (n < 2) {
            return n;
        }
        int up = 1, down = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                up = down + 1;
            } else if (nums[i] < nums[i - 1]) {
                down = up + 1;
            }
        }
        return Math.max(up, down);

    }

    public static void main(String[] args) {
        int[] a={1,7,4,9,2,5};
        int[] b={1,17,5,10,13,15,10,5,16,8};
        int[] c={3,3,3,2,5};
        int[] d={0,0,0,0};
        System.out.println(wiggleMaxLength(d));
    }


/*
    private int check(int[] nums,int index){
        int res=0;
        for (int i = index; i <nums.length-1 ; i++) {

        }

        return res;
    }*/
}
