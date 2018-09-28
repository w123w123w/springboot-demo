package com.wulianfa.springbootdemo.serviceImpl;

import com.wulianfa.springbootdemo.entity.User;
import com.wulianfa.springbootdemo.mapper.UserMapper;
import com.wulianfa.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUser(String name, String password) {
        return userMapper.findUser(name, password);
    }
}
