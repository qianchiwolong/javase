package 力扣.test1720;

/**
 * @Author 陈豪
 * @Date 2021/5/6 17:30
 * @Version 1.0
 */

public class Test {
    public int[] decode(int[] encoded, int first) {
        int[] res=new int[encoded.length+1];
        res[0]=first;
        for (int i = 1; i <res.length ; i++) {
            res[i]=res[i-1]^encoded[i-1];
        }
        return res;
    }
}
