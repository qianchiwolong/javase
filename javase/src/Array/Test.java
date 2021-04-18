package Array;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] a={21,2,2,3};//一维数组静态初始化
        int[][] b={{12,3},{14,2}};//二维数组静态初始化

      /*  int[] a1=new int[5];
        for(int i=0;i< a1.length;i++)
        {
            Scanner sc=new Scanner(System.in);
            int c=sc.nextInt();
            a1[i]=c;
        }
        for (int i=0;i<a1.length;i++)
        {
            System.out.println(a1[i]);
        }*/
        int[][] b2=new int[2][];
        System.out.println(b2[0].length);
      /*  for(int i=0;i<b2.length;i++)
            for(int j=0;j<b2[i].length;j++){
                Scanner sc=new Scanner(System.in);
                int c=sc.nextInt();
                b2[i][j]=c;
            }*/
    }
}
