package 力扣.test985;

/**
 * @Author 陈豪
 * @Date 2021/5/9 20:52
 * @Version 1.0
 */

public class Tes {
    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        /*int[] res=new int[A.length];
        for (int i = 0; i <queries.length ; i++) {
            A[queries[i][1]]+=queries[i][0];
            int temp=0;
            for (int i1 : A) {
                if (i1%2==0) temp+=i1;
            }
            res[i]=temp;
        }
        return res;*/
        int[] res=new int[A.length];
        A[queries[0][1]]+=queries[0][0];
        for (int i : A) {
            if (i%2==0) res[0]+=i;
        }

        for (int i = 1; i <queries.length ; i++) {
            int index=queries[i][1];
            int temp=A[index];
            A[index]+=queries[i][0];
            if (temp%2==0) {
                if (A[index] % 2 == 0) res[i] = res[i - 1] - temp + A[index];
                else res[i] = res[i - 1] - temp;
            }else {
                if (A[index] % 2 == 0) res[i] = res[i - 1]  + A[index];
                else res[i] = res[i - 1] ;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        /*[1,2,3,4]
[[1,0],[-3,1],[-4,0],[2,3]]

[3,2]
[[4,0],[3,0]]
*/
        int[] a={1,2,3,4};
        int[] c={3,2};
        int[][] b={{1,0},{-3,1},{-4,0},{2,3}};
        int[][] d={{4,0},{3,0}};
        sumEvenAfterQueries(c,d);
    }
}
