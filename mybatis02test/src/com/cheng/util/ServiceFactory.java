package com.cheng.util;

public class ServiceFactory {
    //传参得到代理对象
    public static Object getService(Object srevice)
    {
        return new TransactionInvocationHandler(srevice).getProxy();
    }
}
