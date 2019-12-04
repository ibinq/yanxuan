package com.yanxuanproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yanxuanproject.mapper")
public class YanxuanProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(YanxuanProjectApplication.class, args);
    }

}
