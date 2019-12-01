package com.example.restful_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.restful_demo.mapper")
public class RestfulDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestfulDemoApplication.class, args);
    }

}
