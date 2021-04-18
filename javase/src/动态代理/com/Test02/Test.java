package 动态代理.com.Test02;

import 动态代理.com.Test02.andler.mysellhandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        //创建代理对象 使用Proxy
        //1创建目标对象
        UsbKingFactory factory=new UsbKingFactory();
        //2创建invocationhandler对象
        InvocationHandler handler=new mysellhandler(factory);
        //3.创建代理
        usbsell proxy=(usbsell) Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),
                handler);
        //4通过代理执行方法
       float price= proxy.sell(1);
        System.out.println(price);
    }
}
