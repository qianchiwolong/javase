package 力扣.test27;

import java.util.Arrays;

/**
 * @Author 陈豪
 * @Date 2021/4/19 9:43
 * @Version 1.0
 */

public class Test {
    public static   int removeElement(int[] nums, int val) {
        int res=0;
        Arrays.sort(nums);
        int start=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==val){
                res++;
                start=i;
            }
        }

        int index=start-res+1;
        for (int j = index; j <nums.length-res ; j++) {
            nums[j]=nums[j+res];
        }
        return nums.length-res;
    }

    public static void main(String[] args) {
        int[] a={0,1,2,2,3,0,4,2};
        System.out.println(removeElement(a,2));
    }
}
