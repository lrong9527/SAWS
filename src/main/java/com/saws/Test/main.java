package com.saws.Test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        //初始化spring容器
        ApplicationContext applicationcontext =new ClassPathXmlApplicationContext("com/saws/applicationcontext.xml");
    }
}
