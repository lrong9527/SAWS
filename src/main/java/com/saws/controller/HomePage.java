package com.saws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomePage {
    //返回get请求
    @GetMapping("/")
    public String page(Model model, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        Cookie[] cookies = httpServletRequest.getCookies();
        boolean flag = false;
        for(Cookie cookie: cookies){
            if((cookie.getName().equals("username") || cookie.getName().equals("type")) && cookie.getValue().length() != 0){
                model.addAttribute(cookie.getName(), cookie.getValue());
                flag = true;
            }
        }
        model.addAttribute("logged", flag);
        return "homepage";
    }
}
