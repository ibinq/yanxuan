package com.yanxuanproject.service;

import com.yanxuanproject.bean.Address;
import com.yanxuanproject.common.Result;

/**
 * @Author ZhouBing
 * @Date 2019/12/5 14:44
 * @Version 1.0
 **/
public interface AddressService {
    Result save(Address address);

    Result delete(Integer id);

    Result update(Address address);

    Result list(Integer id);

    Result find(Integer id);
}
