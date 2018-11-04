package com.wulianfa.springbootdemo.service;

import java.util.List;

/**
 * 公用Service
 */
public interface commonService<T,V> {
    public T findAll(V var);
}
