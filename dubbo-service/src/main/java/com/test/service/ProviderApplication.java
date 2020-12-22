/*
 * @Author: your name
 * @Date: 2020-12-14 17:14:17
 * @LastEditTime: 2020-12-15 09:02:42
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \dubbo-demo\dubbo-service\src\main\java\com\test\ProviderApplication.java
 */

 package com.test.service;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class ProviderApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}