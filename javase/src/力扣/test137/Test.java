package 力扣.test137;

import java.util.Arrays;

/**
 * @Author 陈豪
 * @Date 2021/4/30 17:19
 * @Version 1.0
 */
/*
* 只有一个数子出现一次其余都出现3次
* */

/*
* int[] counts = new int[32];
for(int i = 0; i < nums.length; i++) {
    for(int j = 0; j < 32; j++) {
        counts[j] += nums[i] & 1; // 更新第 j 位
        nums[i] >>>= 1; // 第 j 位 --> 第 j + 1 位
    }
}
*/
public class Test {
    public int singleNumber(int[] nums) {
        int res=0;
        int[] binary=new int[32];
        for (int num : nums) {
            for (int j = 0; j <32 ; j++) {
                binary[j] +=num&1;
                num>>>=1;
            }
        }
        for (int i = 0; i <binary.length ; i++) {
            binary[i]=binary[i]%3;
        }

        for(int i = 0; i <32; i++) {
            res <<= 1; // 左移 1 位
            res =res | binary[31 - i]; // 恢复第 i 位的值到 res
        }
   return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(chai(-1)));
    }

    private static int[] chai(int i){
        int[] res=new int[32];
        for (int j = 0; j <32 ; j++) {
            res[j]=i&1;
            i>>>=1;
        }
        return res;
    }
}
