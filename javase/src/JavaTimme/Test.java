package JavaTimme;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
    long start=System.currentTimeMillis();
    fun();
    long end=System.currentTimeMillis();
        System.out.println(end-start);
        Date a=new Date(System.currentTimeMillis()-1000*60*60*24);
        SimpleDateFormat sdf=new SimpleDateFormat("yyy-MM-dd   HH:mm:ss SSS");
        String x= sdf.format(a);
        System.out.println(x);
        BigDecimal b1=new BigDecimal(66);
        BigDecimal b2=new BigDecimal(22);
        BigDecimal b3=b1.divide(b2);
        System.out.println(b3);
    }
    public static void fun(){
        for (int i=0;i<1000000000;i++);
    }
}
