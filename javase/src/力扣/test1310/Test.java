package 力扣.test1310;

import java.util.Arrays;

/**
 * @Author 陈豪
 * @Date 2021/5/12 11:23
 * @Version 1.0
 */

public class Test {

    public static int[] xorQueries(int[] arr, int[][] queries) {
       /* int[] res=new int[queries.length];
        for (int i = 0; i <queries.length ; i++) {
            int first=queries[i][0],last=queries[i][1];
           for (;first<=last;first++){
               res[i]=res[i]^arr[first];
           }
        }
        return res;*/
        int n = arr.length, m = queries.length;
        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) sum[i] = sum[i - 1] ^ arr[i - 1];
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int l = queries[i][0] + 1, r = queries[i][1] + 1;
            ans[i] = sum[r] ^ sum[l - 1];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a={1,3,4,8};
        int[][] b={{0,1},{1,2},{0,3},{3,3}};
        System.out.println(Arrays.toString(xorQueries(a,b)));
    }
}
