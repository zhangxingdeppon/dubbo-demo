/*
 * @Author: your name
 * @Date: 2020-12-14 15:31:43
 * @LastEditTime: 2020-12-17 13:52:09
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \dubbo-demo\dubbo-controller\src\main\java\com\test\MyController.java
 */
package com.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bean.ParamDo;
import com.bestpay.bigdata.actual.api.IDubboQueryApi;
import com.bestpay.bigdata.actual.api.model.GeneralRequest;
import com.bestpay.bigdata.actual.api.model.GeneralResponse;
import com.test.TestService;

/**
 * controller
 * @author hwy
 *
 */
@RestController
@RequestMapping("/test")
public class MyController {

    @Reference
    private TestService testService;

    @Reference
    private IDubboQueryApi iDubboQueryApi;

    @GetMapping
    public String testSay(@RequestParam(value = "name",defaultValue = "") String name){
        StringBuffer sb = new StringBuffer();
        System.out.println("收到请求");
        sb.append("Dubbo: ").append(testService.sayHello(name));
        System.out.println("请求处理完成："+ sb.toString() );
        return sb.toString();

        
    }

    
    @PostMapping("/dubboTest")
    public List<Map<String, Object>> dubboTest(@RequestBody ParamDo paramDO){
        long start = System.currentTimeMillis();
        GeneralRequest request = new GeneralRequest();
        request.setKeyId(paramDO.getKeyId());
        request.setUserName(paramDO.getUserName());
        request.setMd5Value(paramDO.getMd5Value());
        request.setPageCount(paramDO.getPageCount());
        request.setPageNum(paramDO.getPageNum());
        request.setParam(paramDO.getParam());
        request.setType(paramDO.getType());
        request.setTraceLogId(paramDO.getTraceLogId());
        long start1 = System.currentTimeMillis();
        System.out.println("dubboTest请求参数耗时："+(start1 - start));
        System.out.println("dubboTest start entering remote dubbo api");
        GeneralResponse generalResponse = iDubboQueryApi.generalQuery(request);
        System.out.println("dubboTest remote dubbo api end");
        long start2 = System.currentTimeMillis();
        System.out.println("dubboTest接口返回耗时："+(start2 - start1));
        List<Map<String, Object>> data = generalResponse.getData();
        long end = System.currentTimeMillis();
        System.out.println("dubboTest结束耗时："+(end - start));
        return data;
    }
    
}
