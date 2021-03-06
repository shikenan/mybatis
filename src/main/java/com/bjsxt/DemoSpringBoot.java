package com.bjsxt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bjsxt.mapper")
public class DemoSpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBoot.class,args);
    }



}
