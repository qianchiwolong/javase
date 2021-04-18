package com.cheng.service;

import com.cheng.domain.Province;

public interface ProvinceService {
    public Province getById(Integer id);
    public void save(Province pro);
}
