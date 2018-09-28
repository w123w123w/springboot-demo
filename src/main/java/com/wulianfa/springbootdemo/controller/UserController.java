package com.wulianfa.springbootdemo.controller;

import com.wulianfa.springbootdemo.entity.User;
import com.wulianfa.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    public String findUser(String name, String password) {
        User user = userService.findUser(name, password);
        if (user==null){
            return "error";
        }
        return "succeed ==>"+user.toString();
    }
}
