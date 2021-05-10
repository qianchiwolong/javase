package 力扣.test1723;

/**
 * @Author 陈豪
 * @Date 2021/5/8 11:26
 * @Version 1.0
 */

public class Test {
   /* public int minimumTimeRequired(int[] jobs, int k) {
        int[] dp=new int[k];
        for (int job : jobs) {
            fun(job,dp);
        }
        int res=Integer.MIN_VALUE;
        for (int i : dp) {
            res=res>i?res:i;
        }
        return res;
    }

    private int[] fun(int a,int[] nums){
        Arrays.sort(nums);
        nums[0]+=a;
        return nums;
    }

    public static void main(String[] args) {
        Test test=new Test();
        int[] a={1,2,4,7,8};
        int i = test.minimumTimeRequired(a, 2);
        System.out.println(i);
    }*/
   int[] jobs;
    int n, k;
    int ans = 0x3f3f3f3f;
    public int minimumTimeRequired(int[] _jobs, int _k) {
        jobs = _jobs;
        n = jobs.length;
        k = _k;
        int[] sum = new int[k];
        dfs(0, 0, sum, 0);
        return ans;
    }
    /**
     * 【补充说明】不理解可以看看下面的「我猜你问」的 Q5 哦 ~
     *
     * u     : 当前处理到那个 job
     * used  : 当前分配给了多少个工人了
     * sum   : 工人的分配情况          例如：sum[0] = x 代表 0 号工人工作量为 x
     * max   : 当前的「最大工作时间」
     */
    void dfs(int u, int used, int[] sum, int max) {
        if (max >= ans) return;
        if (u == n) {
            ans = max;
            return;
        }
        // 优先分配给「空闲工人」
        if (used < k) {
            sum[used] = jobs[u];
            dfs(u + 1, used + 1, sum, Math.max(sum[used], max));
            sum[used] = 0;
        }
        for (int i = 0; i < used; i++) {
            sum[i] += jobs[u];
            dfs(u + 1, used, sum, Math.max(sum[i], max));
            sum[i] -= jobs[u];
        }
    }
}
