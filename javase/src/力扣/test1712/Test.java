package 力扣.test1712;

/**
 * @Author 陈豪
 * @Date 2021/4/20 11:35
 * @Version 1.0
 */

public class Test {
    public static int waysToSplit(int[] nums) {
        int length=nums.length;
        int psum[]=new int[length+1];
        for (int i=0; i<length; ++i) {
            psum[i+1]=psum[i]+nums[i];
        }
        int res=0;
        int a=1, b=1;
        for (int i=0; i<length-2; ++i) {
            a=Math.max(i+1,a);
            while (a<length-1&&psum[a+1]-psum[i+1]<psum[i+1]) {
                a++;
            }
            if (a==length-1) {
                break;
            }
            b=Math.max(b,a);
            while (b<length-1&&psum[length]-psum[b+1]>=psum[b+1]-psum[i+1]) {
                b++;
            }
            res=(res+(b-a))%1000000007;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a={1,2,2,2,5,0};
        System.out.println(waysToSplit(a));
    }
}
