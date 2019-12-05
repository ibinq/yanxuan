package com.yanxuanproject.service;

import com.yanxuanproject.bean.User;
import com.yanxuanproject.common.Result;

/**
 * @Author ZhouBing
 * @Date 2019/11/19 13:28
 * @Version 1.0
 **/
public interface UserService {

     Result<User> login(String username, String password);


    Result<User> register(User user);
}
