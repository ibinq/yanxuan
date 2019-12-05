package com.yanxuanproject.controller;

import com.yanxuanproject.bean.Address;
import com.yanxuanproject.common.Result;
import com.yanxuanproject.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ZhouBing
 * @Date 2019/12/5 14:33
 * @Version 1.0
 *
 *  地址管理
 **/
@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @RequestMapping("/save")
    public Result save(Address address){
        return addressService.save(address);
    }

    @RequestMapping("/delete")
    public Result delete(Integer id){
        return addressService.delete(id);
    }

    @RequestMapping("/update")
    public Result update(Address address){
        return addressService.update(address);
    }

    @RequestMapping("/list")
    public Result list(Integer userId){
        return addressService.list(userId);
    }

    @RequestMapping("/find")
    public Result find(Integer id){
        return addressService.find(id);
    }

}
