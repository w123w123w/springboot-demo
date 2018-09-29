package com.wulianfa.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jumpJspController {

    @RequestMapping("/")
    public String jumpJsp() {
        /*如果是在webapp下的目录下跳转页面需要带上目录名*/
        return "index";
    }
}
