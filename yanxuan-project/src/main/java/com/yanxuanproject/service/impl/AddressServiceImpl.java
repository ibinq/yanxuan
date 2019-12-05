package com.yanxuanproject.service.impl;

import com.yanxuanproject.bean.Address;
import com.yanxuanproject.common.Result;
import com.yanxuanproject.mapper.AddressMapper;
import com.yanxuanproject.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author ZhouBing
 * @Date 2019/12/5 14:44
 * @Version 1.0
 **/
@Service("addressService")
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressMapper addressMapper;

    @Override
    public Result save(Address address) {
        //先判断是超过添加约束 20 条
        Integer count = addressMapper.findAddressCount(address.getUserId());
        if (count == 20)
            return Result.error("当前地址已达到20条");
        if (addressMapper.save(address))
            return Result.success("添加成功");
        return Result.success("新增失败");
    }

    @Override
    public Result delete(Integer id) {
        if (addressMapper.delete(id))
            return Result.success("删除成功");
        return Result.error("删除失败");
    }

    @Override
    public Result update(Address address) {
        if (addressMapper.update(address))
            return Result.success("更新成功");
        return Result.error("更新失败");
    }

    @Override
    public Result list(Integer id) {
        List<Address> address =addressMapper.list(id);
        return Result.success(address);
    }

    @Override
    public Result find(Integer id) {
        Address address = addressMapper.find(id);
        return Result.success(address);
    }
}
