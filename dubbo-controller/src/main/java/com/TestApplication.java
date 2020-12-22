/*
 * @Author: your name
 * @Date: 2020-12-14 17:07:19
 * @LastEditTime: 2020-12-15 09:02:50
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \dubbo-demo\dubbo-controller\src\main\java\com\TestApplication.java
 */
package com;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
    
}