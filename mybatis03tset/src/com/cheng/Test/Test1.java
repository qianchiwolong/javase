package com.cheng.Test;

import com.cheng.domain.Province;
import com.cheng.service.ProvinceService;
import com.cheng.service.impl.ProvinceServiceImpl;
import com.cheng.util.ServiceFactory;
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
       // ProvinceService province=new ProvinceServiceImpl();
        ProvinceService province=(ProvinceService) ServiceFactory.getService(new ProvinceServiceImpl());
//        Province pro=province.getById(1);
//        System.out.println(pro);
//        Province pro1=new Province();
//        pro1.setId(10);
//        pro1.setName("甘肃");
//        pro1.setJiancheng("甘");
//        pro1.setShenghui("兰州");
//        province.save(pro1);
        List<Province> provinceList=province.getAll();
        for (Province ele:
             provinceList) {
            System.out.println(ele);
        }
    }
}
