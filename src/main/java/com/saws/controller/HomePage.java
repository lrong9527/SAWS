package com.saws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {
    //返回get请求
    @GetMapping("/")
    public String page(){
        return "homepage";
    }
}
