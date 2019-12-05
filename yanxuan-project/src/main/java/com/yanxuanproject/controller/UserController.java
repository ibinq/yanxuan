package com.yanxuanproject.controller;

import com.yanxuanproject.bean.User;
import com.yanxuanproject.common.Const;
import com.yanxuanproject.common.Result;
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
    public Result login(@Param("username") String username, @Param("password") String password, HttpSession session){
        Result<User> result = userService.login(username,password);
        if(result.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,result.getData());
        }
        return result;
    }

    @PostMapping("register")
    public Result register(User user){
        Result<User> response = userService.register(user);
        return response;
    }

}
