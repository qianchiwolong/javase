package 剑指offer.Test63;


/**
 * @Author 陈豪
 * @Date 2021/2/10 12:25
 * @Version 1.0
 */

public class Test {
    /*输入: [7,1,5,3,6,4]
输出: 5
解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
*/
    public static int maxProfit(int[] prices) {
      /* int res=0,temp;
       for (int i=0;i<prices.length;i++)
           for (int j=i+1;j<prices.length;j++) {
               temp=prices[j]-prices[i];
               res=temp>=res?temp:res;
           }
       return res;*/
        int cost = Integer.MAX_VALUE, profit = 0;
        for(int price : prices) {
            cost = Math.min(cost, price);
            profit = Math.max(profit, price - cost);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] a={7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }
}
