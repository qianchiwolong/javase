package 剑指offer.Test62;

/**
 * @Author 陈豪
 * @Date 2021/2/10 15:07
 * @Version 1.0
 */

public class Test {

    public static int lastRemaining(int n, int m) {
        int ans = 0;
    // 最后一轮剩下2个人，所以从2开始反推
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
           // System.out.println(ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lastRemaining(5,3));
    }
}
