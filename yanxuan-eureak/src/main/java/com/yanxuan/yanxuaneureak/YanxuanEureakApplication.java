package com.yanxuan.yanxuaneureak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
class YanxuanEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(YanxuanEurekaApplication.class, args);
    }

}
