package 力扣.test88;

import java.util.Arrays;

/**
 * @Author 陈豪
 * @Date 2021/4/5 17:46
 * @Version 1.0
 */

public class Test {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=0;
        for (int i=0;i<m+n;i++)
        {
            if(nums1[i]==0&&index<n)
            {
                nums1[i]=nums2[index];
                index++;
            }
        }
        for(int i=0;i<nums1.length;i++)
            for (int j=0;j<nums1.length-1-i;j++)
            {
                if(nums1[j]>nums1[j+1])
                {
                    int a=nums1[j];
                    nums1[j]=nums1[j+1];
                    nums1[j+1]=a;
                }
            }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(new int[]{2,0},1,new int[]{1},1);
    }
}
