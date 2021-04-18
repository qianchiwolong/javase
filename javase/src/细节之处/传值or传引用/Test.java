package 细节之处.传值or传引用;

public class Test {
    public static void main(String[] args) {
        int i=1;
        System.out.println("之前"+i);
        chenge(i);
        System.out.println("之后"+i);
        StringBuffer sb=new StringBuffer("hou");
        System.out.println("之前"+sb);
        ch(sb);
        System.out.println("之后"+sb);
        int a =1,b=1;

       System.out.println(a+"  "+b);
       for (int j=1;j<20;j++){
           int c=a+b;
           System.out.println(c);
           a=b;
           b=c;
       }
            }

    private static StringBuffer ch(StringBuffer sb) {
       return sb.append("didi");
    }

    private static int  chenge(int i) {
        return ++i;
    }
}
