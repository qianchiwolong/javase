package 剑指offer.Test16;
/**实现函数double Power(double base, int exponent)，求base的exponent次方。
 * 不得使用库函数，同时不需要考虑大数问题。
*/
public class Test {
    public static double myPow(double x, int n) {
        if(x==1) return 1;
        if(x==0) return 0;
        if(n==0) return 1;
        if (n>0) {
            double res=1;
         while (n>=1)
         {
             res*=x;
             n--;
         }
         return res;
        }
        double res=1;
        while (n<=-1)
        {
            res*=x;
            n++;
        }
        return 1/res;

    }

    public static void main(String[] args) {
        System.out.println(myPow(11, 2));
    }
}
