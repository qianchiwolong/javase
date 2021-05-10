package 力扣.test1486;

/**
 * @Author 陈豪
 * @Date 2021/5/7 14:29
 * @Version 1.0
 */

public class Test {
    public int xorOperation(int n, int start) {
        int res=0;
        for (int i = 0; i <n ; i++) {
            int temp=start+2*i;
            res^=temp;
        }
        return res;
    }
}
