package com.cheng.util;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TransactionInvocationHandler implements InvocationHandler {
   private Object target;



    public TransactionInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("执行了");
        SqlSession session=null;
        Object obj=null;
        try {
            session=SqlSessionUtil.getsession();
            System.out.println(session+"123*");
            //处理业务逻辑
            obj =method.invoke(target,objects);
            //处理完成后提交事务
            session.commit();
    }catch (Exception e)
        {
            //如果没成功就回滚
            session.rollback();
            e.printStackTrace();
        }finally {
          SqlSessionUtil.sessionClose(session);
        }
        return obj;
    }
    public Object getProxy()
    {
        //取得代理类对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
