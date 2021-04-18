package com.cheng.service.impl;

import com.cheng.dao.ProvinceDao;
import com.cheng.domain.Province;
import com.cheng.service.ProvinceService;
import com.cheng.util.SqlSessionUtil;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {
    private ProvinceDao provinceDao= SqlSessionUtil.getsession().getMapper(ProvinceDao.class);

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

    @Override
    public List<Province> getAll() {
        List<Province> provinceList=provinceDao.getAll();
        return provinceList;
    }
}
