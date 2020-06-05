package com.com.yh.cn.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/index")
public class HelloController {

    @RequestMapping(value = "/info")
    public String  index(){
        return "success";
    }
}
