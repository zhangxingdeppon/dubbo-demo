/*
 * @Author: your name
 * @Date: 2020-12-16 16:51:10
 * @LastEditTime: 2020-12-16 18:06:52
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \dubbo-demo\dubbo-controller\src\main\java\com\bean\ParamDo.java
 */
package com.bean;

public class ParamDo {

    /**
     * 用户名
     * @len 255
     * @否
     */
    private String userName;
    /**
     * Key序号
     * @len 11
     * @否
     */
    private String keyId;
    /**
     * 接口唯一标识码
     * @len 255
     * @否
     */
    private String type;
    /**
     * 当前页数
     * @否
     */
    private String pageNum;
    /**
     * 当前页数据量
     * @否
     */
    private String pageCount;
    /**
     * Md5验证码
     * @len 32
     * @否
     */
    private String md5Value;
    /**
     * 动态入参
     * @len 2000
     */
    private String param;
    /**
     * 日志id
     * @len 255
     * @否
     */
    private String traceLogId;


public String getUserName() {
    return userName;
}

public void setUserName(String userName) {
    this.userName = userName;
}

public String getKeyId() {
    return keyId;
}

public void setKeyId(String keyId) {
    this.keyId = keyId;
}

public String getType() {
    return type;
}

public void setType(String type) {
    this.type = type;
}

public String getPageNum() {
    return pageNum;
}

public void setPageNum(String pageNum) {
    this.pageNum = pageNum;
}

public String getPageCount() {
    return pageCount;
}

public void setPageCount(String pageCount) {
    this.pageCount = pageCount;
}

public String getMd5Value() {
    return md5Value;
}

public void setMd5Value(String md5Value) {
    this.md5Value = md5Value;
}

public String getParam() {
    return param;
}

public void setParam(String param) {
    this.param = param;
}

public String getTraceLogId() {
    return traceLogId;
}

public void setTraceLogId(String traceLogId) {
    this.traceLogId = traceLogId;
}
    
}