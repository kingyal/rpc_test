package com.kingyal.rpc.client;

import lombok.Data;

/**
 * 表示rpc的响应
 */
@Data
public class Response {
    /**
     * 服务返回码，0表示成功，1表示失败。
     */
    private int code;
    /**
     * 具体的错误信息
     */
    private String message = "ok";
    /**
     * 返回的数据
     */
    private Object data;
}
