/*
 * @Author: your name
 * @Date: 2020-12-14 16:08:39
 * @LastEditTime: 2020-12-21 19:45:33
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \dubbo-demo\dubbo-service\src\main\java\com\test\TestServiceImpl.java
 */
package com.test.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.TestService;

/**
 * service impl
 * @author hwy
 *
 */
@Service
public class TestServiceImpl implements TestService{

    @Override
    public String sayHello(String name) {
        System.out.println("该请求进入provider，传入参数name："+ name);
        return name + " V2 service2 say hello word service2!";
    }

}