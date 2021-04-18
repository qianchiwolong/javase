package 剑指offer.Test17;
/**输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
 * 比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 * */
public class Test {
    public static int[] printNumbers(int n) {
       int[] res=new int[fun(n)];
       int count=1;
       for (int i=0;i<res.length;i++)
       {
           res[i]=count;
           count++;
       }
       return res;
    }
    public static int fun(int n)
    {
        int res=0;
        int count=1;
       while (n>0)
       {
           res+=count*9;
           count*=10;
           n--;
       }
       return res;
    }

    public static void main(String[] args) {
        System.out.println(fun(1));
        int a[]=printNumbers(1);
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
