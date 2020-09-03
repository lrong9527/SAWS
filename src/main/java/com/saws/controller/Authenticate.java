package com.saws.controller;

import com.saws.dao.AdminDao;
import com.saws.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Authenticate {

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    UserDao userDao;

    @Autowired
    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

    AdminDao adminDao;

    @PostMapping("/authenticate")
    public String authenticate(@RequestParam("name") String name, @RequestParam("pw") String pw,
                               HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        if(userDao.authenticate(name, pw)){
            Cookie usernameCookie = new Cookie("username", name), typeCookie = new Cookie("type", "普通用户");
            usernameCookie.setMaxAge(3600);
            typeCookie.setMaxAge(3600);
            httpServletResponse.addCookie(usernameCookie);
            httpServletResponse.addCookie(typeCookie);
        }
        return "redirect:/";
    }

    @GetMapping("/authenticate")
    public String page(){
        return "user_login";
    }

    @PostMapping("/adminAuthenticate")
    public String adminAuthenticate(@RequestParam("name") String name, @RequestParam("pw") String pw,
                               HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        if(adminDao.authenticate(name, pw)){
            Cookie usernameCookie = new Cookie("username", name), typeCookie = new Cookie("type", "管理员");
            usernameCookie.setMaxAge(3600);
            typeCookie.setMaxAge(3600);
            httpServletResponse.addCookie(usernameCookie);
            httpServletResponse.addCookie(typeCookie);
        }
        return "redirect:user_manage.html";
    }

    @GetMapping("/adminAuthenticate")
    public String adminPage(){
        return "admin_login";
    }

    @GetMapping("/logout")
    public String logout(HttpServletResponse httpServletResponse, HttpServletRequest httpServletRequest){
        httpServletRequest.getCookies();
        Cookie usernameCookie = new Cookie("username", null), typeCookie = new Cookie("type", null);
        usernameCookie.setMaxAge(3600);
        typeCookie.setMaxAge(3600);
        httpServletResponse.addCookie(usernameCookie);
        httpServletResponse.addCookie(typeCookie);
        return "redirect:/";
    }
}
