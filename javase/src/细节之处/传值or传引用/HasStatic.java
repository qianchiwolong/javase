package 细节之处.传值or传引用;

/**
 * @Author 陈豪
 * @Date 2021/3/13 16:10
 * @Version 1.0
 */

public class HasStatic {
    private static int x=100;
     public static void main(String args[]){
                HasStatic hs1=new HasStatic();
                hs1.x++;
                HasStatic  hs2=new HasStatic();
                hs2.x++;
                hs1=new HasStatic();
                hs1.x++;
               HasStatic.x--;
               System.out.println("x="+x);
            }

}
