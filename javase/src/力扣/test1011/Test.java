package 力扣.test1011;

/**
 * @Author 陈豪
 * @Date 2021/4/26 21:39
 * @Version 1.0
 */

public class Test {
    public int shipWithinDays(int[] weights, int D){
        int max = 0, sum = 0;
        for (int w : weights) {
            max = Math.max(max, w);
            sum += w;
        }
        int l = max, r = sum;
        while (l < r) {
            int mid = l + r >> 1;
            if (check(weights, mid, D)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }
    boolean check(int[] weigths, int t, int d) {
        int n = weigths.length;
        int cnt = 1;
        for (int i = 1, sum = weigths[0]; i < n; sum = 0, cnt++) {
            while (i < n && sum + weigths[i] <= t) {
                sum += weigths[i];
                i++;
            }
        }
        return cnt - 1 <= d;
    }
}
