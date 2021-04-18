package 力扣.Test09;

public class Test {
    public static boolean isPalindrome(int x) {
        if (x<0) return false;
        int pop = x;
        int fanzhuan = 0;
        while (x != 0) {
            int a = x % 10;
            fanzhuan = fanzhuan * 10 + a;
            x = x / 10;
        }
        System.out.println(fanzhuan);
        if (pop == fanzhuan) return true;
        else return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }
}