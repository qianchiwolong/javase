package 力扣.test198;

/**
 * @Author 陈豪
 * @Date 2021/5/5 11:23
 * @Version 1.0
 */

public class Test {
    public static int rob(int[] nums) {
        if (nums.length==0) return 0;
        if (nums.length==1) return nums[0];
        int n2=nums[0];
        int n1=nums[0]>nums[1]?nums[0]:nums[1];
        for (int i = 2; i <nums.length ; i++) {
            if (nums[i]+n2>n1){
                int temp=n1;
                n1=nums[i]+n2;
                n2=temp;
            }else {
                n2=n1;
            }
        }
        return n1>n2?n1:n2;
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,2,3,1}));
    }
}
