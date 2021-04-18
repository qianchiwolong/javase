package com.cheng.service;

import com.cheng.domain.Province;

import java.util.List;

public interface ProvinceService {
    public Province getById(Integer id);
    public void save(Province pro);

    List<Province> getAll();
}
