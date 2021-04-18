package com.cheng.Test;

import com.cheng.domain.Province;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        String rssource="mybatis-conflg.xml";
        InputStream inputStream= null;
        try {
            inputStream = Resources.getResourceAsStream(rssource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=sqlSessionFactory.openSession();
        Province province= session.selectOne("test1.getbyid",1);
        System.out.println(province);
        session.close();
    }
}
