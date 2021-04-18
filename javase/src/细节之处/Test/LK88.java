package 细节之处.Test;

public class LK88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

//        int index=0;
//        for (int i=0;i<m+n;i++)
//        {
//            if(nums1[i]==0&&index<n)
//            {
//                nums1[i]=nums2[index];
//                index++;
//            }
//        }
//        for(int i=0;i<nums1.length;i++)
//            for (int j=0;j<nums1.length-1;j++)
//            {
//                if(nums1[j]>nums1[j+1])
//                {
//                    int a=nums1[j];
//                    nums1[j]=nums1[j+1];
//                    nums1[j+1]=a;
//                }
//            }
        int index1=nums1.length-1;
        int index2=nums2.length-1;

        int[] a=new int[nums1.length+nums2.length];
        int index3=a.length-1;
        while (index1>0||index2>0)
        {
            if(nums1[index1]>=nums2[index2])
            {
                a[index3]=nums1[index1];
                index1--;
            }else {
                a[index3]=nums2[index2];
                index2--;
            }
            index3--;
        }
         nums1=a;
    }

    public static void main(String[] args) {
        int [] a={1,5,6,8,0,0,0};
        int [] b={2,5,1};
        System.arraycopy(b,0,a,1,b.length);//0是b数组的开始下标，1是a数组的下标，1是复制b从下标开始的长度
        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);
        System.out.println(a.length);
    }
}
