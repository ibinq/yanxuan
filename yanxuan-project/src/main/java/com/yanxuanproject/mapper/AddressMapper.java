package com.yanxuanproject.mapper;

import com.yanxuanproject.bean.Address;
import com.yanxuanproject.common.Result;

import java.util.List;

/**
 * @Author ZhouBing
 * @Date 2019/12/5 14:47
 * @Version 1.0
 **/
public interface AddressMapper {
    boolean save(Address address) ;

    Integer findAddressCount(Integer userId);

    boolean delete(Integer id);

    boolean update(Address address);

    List<Address> list(Integer id);

    Address find(Integer id);
}
