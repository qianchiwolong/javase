package 剑指offer.test66;

import java.util.Arrays;

/**
 * @Author 陈豪
 * @Date 2021/4/19 14:15
 * @Version 1.0
 */

public class Test {
    public static int[] constructArr(int[] a) {
       /* int[] res=new int[a.length];
        for (int i = 0; i <res.length ; i++) {
            res[i]=1;
        }
        for (int i = 0; i <res.length ; i++) {
            int j = 0;
            for (; j <a.length ; j++) {
                if (i==j)continue;
                else {
                    res[i]*=a[j];
                }
            }
        }
        return res;*/
        if(a.length == 0) return new int[0];
        int[] b = new int[a.length];
        b[0] = 1;
        int tmp = 1;
        for(int i = 1; i < a.length; i++) {
            b[i] = b[i - 1] * a[i - 1];
        }
        for(int i = a.length - 2; i >= 0; i--) {
            tmp *= a[i + 1];
            b[i] *= tmp;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println(Arrays.toString(constructArr(a)));
    }
}
