package 力扣.test7;

/**
 * @Author 陈豪
 * @Date 2021/5/3 21:15
 * @Version 1.0
 */

public class Test {
    public static int reverse(int x) {
  /*      long res=0;
        String a=String.valueOf(x);
        StringBuilder sb=new StringBuilder();
        if (x>=0) {
            for (int i = a.length()-1; i >= 0; i--) {
                sb.append(a.charAt(i));
            }
             res = Long.valueOf(String.valueOf(sb));
        }else {
            for (int i = a.length()-1; i >= 1; i--) {
                sb.append(a.charAt(i));
            }
            res = -Long.valueOf(String.valueOf(sb));
        }
        if (res>Integer.MIN_VALUE&&res<Integer.MAX_VALUE) return (int) res;
     return 0;*/
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
        System.out.println(reverse(-123456));
    }

}
