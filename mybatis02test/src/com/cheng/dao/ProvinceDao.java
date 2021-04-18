package com.cheng.dao;

import com.cheng.domain.Province;

public interface ProvinceDao {
    public Province getById(Integer id);
    public void save(Province pro);
}
