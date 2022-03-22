package com.wsy.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wsy.server.mapper.**")
public class SpocServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpocServerApplication.class, args);
    }
}
