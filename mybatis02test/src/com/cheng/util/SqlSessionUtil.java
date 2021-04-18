package com.cheng.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    private static SqlSessionFactory sqlSessionFactory=null;
    //工具类的私有构造方法 防止调用时产生垃圾代码
    private SqlSessionUtil() {
    }

    //取得session对象
    static {
        String rssource="mybatis-conflg.xml";
        InputStream inputStream= null;
        try {
            inputStream = Resources.getResourceAsStream(rssource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory=  new SqlSessionFactoryBuilder().build(inputStream);
    }
    private static ThreadLocal<SqlSession> t=new InheritableThreadLocal<>();
    public static SqlSession getsession()
    {
        SqlSession session=t.get();
        System.out.println(session+"456*");
        if (session==null)
        {
            session=sqlSessionFactory.openSession();
            t.set(session);
        }
        return session;
    }
    //关闭session对象
    public static void sessionClose(SqlSession session)
    {
        if (session!=null)
        {
            session.close();
            //必须加让线程池中的线程“干净”
            t.remove();
        }
    }
}
