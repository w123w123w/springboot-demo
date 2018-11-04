package com.wulianfa.springbootdemo.service;

import com.wulianfa.springbootdemo.entity.User;

import java.util.List;

/**
 * 公用Service
 */
public interface commonService<T,V> {
    T findAll(V var);
}
