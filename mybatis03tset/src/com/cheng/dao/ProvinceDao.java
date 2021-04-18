package com.cheng.dao;

import com.cheng.domain.Province;

import java.util.List;

public interface ProvinceDao {
    public Province getById(Integer id);
    public void save(Province pro);

    List<Province> getAll();
}
