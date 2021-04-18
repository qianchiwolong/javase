/*
* 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。



示例 1：

输入：arr = [3,2,1], k = 2
输出：[1,2] 或者 [2,1]

示例 2：

输入：arr = [0,1,2,1], k = 1
输出：[0]*/
package 剑指offer.Test40;

import java.util.Arrays;
/*src - 源数组。
srcPos - 源数组中的起始位置。
dest - 目标数组。
destPos - 目标数据中的起始位置。
length - 要复制的数组元素的数量。
* */
public class Test {
    public int[] getLeastNumbers(int[] arr, int k) {
       int[] res=new int[k];
       buttonsort(arr);

       System.arraycopy(arr,0,res,0,res.length);
       return res;
    }

    public static  void buttonsort(int[] arr){
        int temp;
        boolean falg=false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    falg=true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!falg) break;
            else falg=false;
        }
    }



    public static void sort(int[] arr){
        int temp;
        for (int i=0;i<arr.length;i++){
            int k=i+1;
            for (;k<arr.length;k++){
                if (arr[i]>arr[k]){
                    temp=arr[i];
                    arr[i]=arr[k];
                    arr[k]=temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {3, 54, -2, 0, 7, -1};
        buttonsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

