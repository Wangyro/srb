package com.atguigu.srb.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Wang Yuran
 * @create 2022-03-23 18:29
 */

@SpringBootApplication
@ComponentScan({"com.atguigu.srb", "com.atguigu.common"})
public class ServiceCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCoreApplication.class, args);
    }
}