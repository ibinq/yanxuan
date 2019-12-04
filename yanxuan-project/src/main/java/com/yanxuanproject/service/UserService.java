package com.yanxuanproject.service;

import com.yanxuanproject.bean.User;
import com.yanxuanproject.common.ServerResponse;

/**
 * @Author ZhouBing
 * @Date 2019/11/19 13:28
 * @Version 1.0
 **/
public interface UserService {

     ServerResponse<User> login(String username, String password);


    ServerResponse<User> register(User user);
}
