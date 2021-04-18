package JiBenShuJuBaoZhuangLei;

public class Test {
    public static void main(String[] args) {
        Integer a=new Integer(100);
        fun(a);
        fun(new Integer(20));
        Object er=500;//自动装箱
        int x=(Integer) er;//自动拆箱
        Integer a1=50;
        System.out.println(a1+1);//先自动拆箱再去加运算
        Integer X=10;
        Integer Y=10;
        System.out.println(X+Y);//自动拆箱运算
        System.out.println(X==Y);//不会自动拆箱直接比较内存地址 true因为【-128，127】整形常量池
        Integer b=500;
        Integer c=500;
        System.out.println(b==c);//false
        System.out.println("===========================================================");
        int h=Integer.parseInt("123");
        double d=Double.parseDouble("3.14");
        System.out.println(h);
        System.out.println(d);
        //int k=Integer.parseInt("中国");//NumberFormatException数字格式化异常
    }
    public static void fun(Object obj)
    {
        System.out.println(obj);
    }
}
