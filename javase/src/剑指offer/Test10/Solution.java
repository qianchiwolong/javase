package 剑指offer.Test10;

import java.util.ArrayList;
import java.util.List;

/**
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 *
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 *
 * 示例 1：
 *
 * 输入：n = 2
 * 输出：1
 *
 * 示例 2：
 *
 * 输入：n = 5
 * 输出：5
 *
 *
 *
 * 提示：
 *
 *     0 <= n <= 100
 */
public class Solution {

   /* public  int fib(int n) {
       if (n>92) return 1;
       else return  (int)fibLoop(n)%1000000007;
    }
    public static long fibLoop(int num) {
        if(num < 1 || num > 92)
            return 0;
        long a = 1;
        long b = 1;
        long temp;
        for(int i = 3; i <= num; i++) {
            temp = a;
            a = b;
            b += temp;
        }
        return b;
    }*/
   /*public  int fib(int n) {
       if(n < 1 || n> 92)
           return 0;
       long a = 1;
       long b = 1;
       long temp;
       for(int i = 3; i <= n; i++) {
           temp = a;
           a = b;
           b += temp;
       }
       if (b==1000000008) return 1;
       else return (int) b%1000000007;*/
   public int fib(int n) {
       int a = 0, b = 1, sum;
       for(int i = 0; i < n; i++){
           sum = (a + b) % 1000000007; //保证不会溢出现象的出现
           a = b;
           b = sum;
       }
       return a;
   }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.fib(100));
    }
}
