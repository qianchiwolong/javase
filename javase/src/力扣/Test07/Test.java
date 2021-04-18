package 力扣.Test07;


/**给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

 示例 1:

 输入: 123
 输出: 321
  示例 2:

 输入: -123
 输出: -321
 示例 3:

 输入: 120
 输出: 21

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/reverse-integer
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */
public class Test {
    public static int reverse(int x) {
        long result=0;
        while (x!=0)
        {
            int a=x%10;
            result=result*10+a;
            x=x/10;
        }
        if(result<Integer.MIN_VALUE) return 0;
        if(result>Integer.MAX_VALUE) return 0;
        return (int)result;
    }

    public static void main(String[] args) {

//         System.out.println(reverse(1523456789));
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(reverse(-2147483648));

    }
}
