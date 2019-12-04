package com.yanxuanproject.service.impl;

import com.yanxuanproject.bean.User;
import com.yanxuanproject.common.ServerResponse;
import com.yanxuanproject.mapper.UserMapper;
import com.yanxuanproject.service.UserService;
import com.yanxuanproject.util.MD5Util;
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
    public ServerResponse<User> login(String username, String password) {
        int resultCount = userMapper.checkUsername(username);
        if(resultCount == 0 ){
            return ServerResponse.createByErrorMessage("用户名不存在");
        }

        String md5Password = MD5Util.MD5EncodeUtf8(password);
        User user  = userMapper.selectLogin(username,md5Password);
        if(user == null){
            return ServerResponse.createByErrorMessage("密码错误");
        }

        user.setPassword(org.apache.commons.lang3.StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功",user);
    }



    @Override
    public ServerResponse<User> register(User user) {
        String newpasword = MD5Util.MD5EncodeUtf8(user.getPassword());
         user.setPassword(newpasword);
        if (userMapper.addUser(user)){
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByError();
    }
}
