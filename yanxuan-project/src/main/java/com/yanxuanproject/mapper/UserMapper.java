package com.yanxuanproject.mapper;

import com.yanxuanproject.bean.User;

/**
 * @Author ZhouBing
 * @Date 2019/11/19 13:23
 * @Version 1.0
 **/
public interface UserMapper {
    boolean addUser(User user);

    int checkUsername(String username);

    User selectLogin(String username, String md5Password);
}
