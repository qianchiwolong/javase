package 剑指offer.Test15;

public class Test {
    public static int hammingWeight(int n) {
      // return Integer.toString(n).replaceAll("0", "").length();
        int res = 0;
        while(n != 0) {
            res += n & 1;

            n >>>= 1;
        }
        return res;

    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(1001));

    }
}
