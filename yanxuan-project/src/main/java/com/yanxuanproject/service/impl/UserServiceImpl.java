package com.yanxuanproject.service.impl;

import com.yanxuanproject.bean.User;
import com.yanxuanproject.mapper.UserMapper;
import com.yanxuanproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author ZhouBing
 * @Date 2019/11/19 13:28
 * @Version 1.0
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
