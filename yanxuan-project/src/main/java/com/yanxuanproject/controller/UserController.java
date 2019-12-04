package com.yanxuanproject.controller;

import com.yanxuanproject.bean.User;
import com.yanxuanproject.common.Const;
import com.yanxuanproject.common.ServerResponse;
import com.yanxuanproject.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @Author ZhouBing
 * @Date 2019/11/19 13:31
 * @Version 1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping("login")
    public ServerResponse login(@Param("username") String username, @Param("password") String password, HttpSession session){
        ServerResponse<User> response = userService.login(username,password);
        if(response.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,response.getData());
        }
        return response;
    }

    @PostMapping("register")
    public ServerResponse register(User user){
        ServerResponse<User> response = userService.register(user);
        return response;
    }

}
