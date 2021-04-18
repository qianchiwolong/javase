package 细节之处.Test;

public class LK8802 {
    public static int [] merge(int[] nums1, int m, int[] nums2, int n) {
    int index1=m-1;
    int index2=n-1;

    int[] a=new int[n+m];
    int index3=a.length-1;
        while (index1>=0||index2>=0)
    {
        if(nums1[index1]>=nums2[index2])
        {
            a[index3]=nums1[index1];
            index1--;
        }else {
            a[index3]=nums2[index2];
            if(index2>1)
            index2--;
            else {
                System.arraycopy(nums1,0,a,0,nums1.length-1-index1);
            }
        }
        index3--;
    }
    nums1=a;
        return nums1;
}

    public static void main(String[] args) {
        int [] nums1 ={1,2,3,0,0,0};
        int [] nums2={2,5,6};
       int[] h= merge(nums1,3,nums2,3);

    }

}
