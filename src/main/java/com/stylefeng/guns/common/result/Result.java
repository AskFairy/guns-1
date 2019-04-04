package com.stylefeng.guns.common.result;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: chong.chen
 * @Description:
 * @Date: Created in 2019/03/30
 * @Modified by:
 */
public class Result<T> {

    @ApiModelProperty(value = "状态码")
    private int code;

    @ApiModelProperty(value = "描述")
    private String message;

    @ApiModelProperty(value = "数据")
    private T data;
    
    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    
    public int getCode() {
        return code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
}
