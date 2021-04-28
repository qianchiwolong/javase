package 力扣.test633;

/**
 * @Author 陈豪
 * @Date 2021/4/28 11:26
 * @Version 1.0
 */

public class Test {

    public static boolean judgeSquareSum(int c) {
        int right=0,left= (int) Math.sqrt(c);
        while (right<=left){
            int temp=right*right+left*left;
            if (temp>c) left--;
            if (temp<c) right++;
            if (temp==c) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(4));
    }
}
