package 力扣.test740;

/**
 * @Author 陈豪
 * @Date 2021/5/5 12:24
 * @Version 1.0
 */

public class test {
    public static int deleteAndEarn(int[] nums) {
        int max=0;
        for (int num : nums) {
            max=max>num?max:num;
        }
        int[] dp=new int[max+1];
        for (int i = 0; i <nums.length ; i++) {
            dp[nums[i]]+=1;
        }
        if (dp.length==0)return 0;
        if (dp.length==1)return dp[0];
        int n2=0;
        int n1=1*dp[1];
        for (int i = 2; i <dp.length ; i++) {
            if (i*dp[i]+n2>n1){
                int temp=n1;
                n1=i*dp[i]+n2;
                n2=temp;
            }else n2=n1;
        }

        return n1;
    }

    public static void main(String[] args) {
        int[] a={3,4,2};
        System.out.println(deleteAndEarn(a));
    }
}
