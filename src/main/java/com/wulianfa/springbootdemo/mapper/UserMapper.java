package com.wulianfa.springbootdemo.mapper;

import com.wulianfa.springbootdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User findUser(@Param("name") String name, @Param("password") String password);
}
