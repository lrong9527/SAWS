package com.saws;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.saws.entity.mapper")
@SpringBootApplication
public class SawsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SawsApplication.class, args);
    }

}
