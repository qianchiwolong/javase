package 剑指offer.test58;

/**
 * @Author 陈豪
 * @Date 2021/4/15 17:20
 * @Version 1.0
 */

public class Test2 {
    public static String reverseLeftWords(String s, int n) {
        StringBuilder res=new StringBuilder();
        res.append(s.substring(n,s.length()));
        res.append(s.substring(0,n));
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdef",2));
    }
}
