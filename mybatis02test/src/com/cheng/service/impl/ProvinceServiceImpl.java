package com.cheng.service.impl;

import com.cheng.dao.ProvinceDao;
import com.cheng.dao.impl.ProvinceDaoImpl;
import com.cheng.domain.Province;
import com.cheng.service.ProvinceService;

public class ProvinceServiceImpl implements ProvinceService {
    private ProvinceDao provinceDao=new ProvinceDaoImpl();

    @Override
    public Province getById(Integer id) {
        Province pro=provinceDao.getById(id);
        return pro;
    }

    @Override
    public void save(Province pro) {
        System.out.println("serviceImpl执行了");
         provinceDao.save(pro);
    }
}
