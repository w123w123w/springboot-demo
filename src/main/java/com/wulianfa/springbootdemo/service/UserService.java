package com.wulianfa.springbootdemo.service;

import com.wulianfa.springbootdemo.entity.User;

public interface UserService {
    User findUser(String name, String password);
}
