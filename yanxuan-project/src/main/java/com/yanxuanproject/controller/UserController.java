package com.yanxuanproject.controller;

import com.yanxuanproject.bean.User;
import com.yanxuanproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("addUser")
    public void addUser( User user){
        userService.addUser(user);
    }




}
