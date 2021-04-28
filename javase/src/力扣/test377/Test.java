package 力扣.test377;

/**
 * @Author 陈豪
 * @Date 2021/4/24 22:17
 * @Version 1.0
 */

public class Test {
    public static int combinationSum4(int[] nums, int target) {
        int[] f = new int[target + 1];
        f[0] = 1;
        for (int j = 1; j <= target; j++) {
            for (int u : nums) {
                if (j >= u) f[j] += f[j - u];
            }
        }
        return f[target];
    }

    public static void main(String[] args) {
        int[] a={1,2,3};
        System.out.println(combinationSum4(a,4));
    }

}
