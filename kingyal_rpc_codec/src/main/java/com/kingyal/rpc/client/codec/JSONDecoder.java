package com.kingyal.rpc.client.codec;

import com.alibaba.fastjson.JSON;

/**
 * 基于fastjson的反序列化实现
 */
public class JSONDecoder implements Decoder {
    @Override
    public <T> T decode(byte[] bytes, Class<T> clazz) {
        return JSON.parseObject(bytes, clazz);
    }
}
