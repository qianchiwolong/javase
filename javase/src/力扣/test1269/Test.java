package 力扣.test1269;

/**
 * @Author 陈豪
 * @Date 2021/5/13 15:23
 * @Version 1.0
 */

public class Test {
    public static int numWays(int steps, int arrLen) {
        int mod=(int) 10e9+7;
        int max = Math.min(steps / 2, arrLen - 1);
        int[][] f = new int[steps + 1][max + 1];
        f[steps][0] = 1;
        for (int i = steps - 1; i >= 0; i--) {
            for (int j = 0; j <= max; j++) {
                f[i][j] = (f[i][j] + f[i + 1][j]) %mod;
                if (j - 1 >= 0) f[i][j] = (f[i][j] + f[i + 1][j - 1]) % mod;
                if (j + 1 <= max) f[i][j] = (f[i][j] + f[i + 1][j + 1]) % mod;
            }
        }
        return f[0][0];

    }

    public static void main(String[] args) {
        System.out.println(numWays(3,2));
    }
}
