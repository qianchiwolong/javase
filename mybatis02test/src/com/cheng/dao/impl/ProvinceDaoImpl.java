package com.cheng.dao.impl;

import com.cheng.dao.ProvinceDao;
import com.cheng.domain.Province;
import com.cheng.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class ProvinceDaoImpl implements ProvinceDao {

    @Override
    public Province getById(Integer id) {
        SqlSession session= SqlSessionUtil.getsession();
        Province pro=session.selectOne("test1.getById",id);
        return pro;
    }

    @Override
    public void save(Province pro) {
        SqlSession session= SqlSessionUtil.getsession();
        session.insert("test1.save",pro);
        System.out.println(session+"***");
        //session.commit();
    }
}
