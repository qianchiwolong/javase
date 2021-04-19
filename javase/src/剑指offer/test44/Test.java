package 剑指offer.test44;

/**
 * @Author 陈豪
 * @Date 2021/4/19 17:25
 * @Version 1.0
 */

public class Test {



    public static int findNthDigit(int n) {
        int digit = 1;
        long start = 1;
        long count = 9;
        while (n > count) {
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
        long num = start + (n - 1) / digit; // 2.
        //System.out.println((n - 1) % digit);
        //System.out.println(Long.toString(num).charAt((n - 1) % digit));
        return Long.toString(num).charAt((n - 1) % digit)-'0';
    }

    public static void main(String[] args) {
        System.out.println(findNthDigit(11));
    }
}



