package com.saws.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.saws.dao.UserDao;
import com.saws.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
public class Register {
    //注入
    UserDao userDao;
    @Autowired
    void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }

    //注册
    //返回post请求
    @RequestMapping(method = RequestMethod.POST,value = "/register")
    public String register(HttpServletRequest httpServletRequest) throws JsonProcessingException {
        User user = new User();
//        user.setUser_id(httpServletRequest.getParameter("userid"));
//        user.setUser_password(httpServletRequest.getParameter("user_pw"));
//        user.setUsr_name(httpServletRequest.getParameter("user_name"));
//        user.setUser_phone(Long.parseLong(httpServletRequest.getParameter("user_phone")));
//        user.setUser_address(httpServletRequest.getParameter("user_address"));
//        user.setUser_age(Integer.parseInt(httpServletRequest.getParameter("user_age")));
//        user.setUser_gender(httpServletRequest.getParameter("user_sex"));
        System.out.println(httpServletRequest.getParameter("userid"));
        user.setUser_id(httpServletRequest.getParameter("userid"));
        System.out.println(httpServletRequest.getParameter("user_pw"));
        user.setUser_password(httpServletRequest.getParameter("user_pw"));
        System.out.println(httpServletRequest.getParameter("user_name"));
        user.setUsr_name(httpServletRequest.getParameter("user_name"));
        System.out.println(httpServletRequest.getParameter("user_phone"));
        user.setUser_phone(Long.parseLong(httpServletRequest.getParameter("user_phone")));
        System.out.println(httpServletRequest.getParameter("user_address"));
        user.setUser_address(httpServletRequest.getParameter("user_address"));
        System.out.println(Integer.parseInt(httpServletRequest.getParameter("user_age")));
        user.setUser_age(Integer.parseInt(httpServletRequest.getParameter("user_age")));
        System.out.println(httpServletRequest.getParameter("user_sex"));
        user.setUser_gender(httpServletRequest.getParameter("user_sex"));

        Boolean res = userDao.register(user);

        if(res) return "register_T";
        else return "register_F";
    }

    //返回get请求
    @GetMapping("/register")
    public String page(){
        return "register";
    }
}

