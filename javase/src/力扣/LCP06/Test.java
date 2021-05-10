package 力扣.LCP06;

/**
 * @Author 陈豪
 * @Date 2021/5/4 19:57
 * @Version 1.0
 */

public class Test {
    public int minCount(int[] coins) {
        int res=0;
        for (int coin : coins) {
            if (coin%2==0) res+=coin/2;
            else res +=coin/2+1;
        }
        return res;
    }
}
