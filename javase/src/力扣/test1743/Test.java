package 力扣.test1743;

/**
 * @Author 陈豪
 * @Date 2021/5/11 9:39
 * @Version 1.0
 */
/*它被加密成另一个长度为 n - 1 的整数数组 encoded ，
满足 encoded[i] = perm[i] XOR perm[i + 1] 。 a=b ^ c  a^a^b=b^c^b^a  b=c^a
比方说，如果 perm = [1,3,2] ，那么 encoded = [2,1] 。

给你 encoded 数组，请你返回原始数组 perm 。题目保证答案存在且唯一。
*/
/*
* 输入：encoded = [6,5,4,6]
输出：[2,4,1,5,3]
*
* 输入：encoded = [3,1]
输出：[1,2,3]
解释：如果 perm = [1,2,3] ，
* 那么 encoded = [1 XOR 2,2 XOR 3] = [3,1]
* */
public class Test {
    public int[] decode(int[] encoded) {
        /*int[] perm=new int[encoded.length+1];
        for (int i = 0; i < perm.length; i++) {

        }
    return perm;*/
        int n = encoded.length + 1;
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total ^= i;
        }
        int odd = 0;
        for (int i = 1; i < n - 1; i += 2) {
            odd ^= encoded[i];
        }
        int[] perm = new int[n];
        perm[0] = total ^ odd;
        for (int i = 0; i < n - 1; i++) {
            perm[i + 1] = perm[i] ^ encoded[i];
        }
        return perm;
    }

    public static void main(String[] args) {
        //System.out.println(0^5); //XOR 性质 1. n XOR 0 = n   2. n XOR n =0
        //System.out.println(4^2^6); //6
        System.out.println(2^1);
        System.out.println(3^1);
        System.out.println(6^5);


    }
}
