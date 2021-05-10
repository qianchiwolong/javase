package 力扣.test554;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 陈豪
 * @Date 2021/5/2 21:09
 * @Version 1.0
 */

public class Test {
    public int leastBricks(List<List<Integer>> wall) {
        int n = wall.size();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0, sum = 0; i < n; i++, sum = 0) {
            for (int cur : wall.get(i)) {
                sum += cur;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            map.remove(sum); // 不能从两边穿过，需要 remove 掉最后一个
        }
        int ans = n;
        for (int u : map.keySet()) {
            int cnt = map.get(u);
            ans = Math.min(ans, n - cnt);
        }
        return ans;

    }
}
