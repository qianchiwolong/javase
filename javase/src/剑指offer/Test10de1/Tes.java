package 剑指offer.Test10de1;

public class Tes {
    public static int numWays(int n) {
        //不建议使用递归
      //  if (n<=1) return 1;
      //  return (numWays(n-1)+numWays(n-2))%1000000007;
        //改为非递归；
        if (n<=1) return 1;
        int a=1,b=1,temp;
        for (int i=1;i<n;i++)
        {
            temp=a;
            a=b;
            b=(temp+b)%1000000007;
        }
       return b;

    }

    public static void main(String[] args) {
        System.out.println(numWays(7));
    }
}
