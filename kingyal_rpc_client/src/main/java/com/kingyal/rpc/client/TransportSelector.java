package com.kingyal.rpc.client;

import com.kingyal.rpc.client.transport.TransportClient;

import java.util.List;

public interface TransportSelector {
    /**
     * 初始化selector
     * @param peers 可以连接的server端点信息
     * @param count client与server建立的连接数
     * @param clazz client实现class
     */
    void init(List<Peer> peers, int count, Class<? extends  TransportClient> clazz);
    /**
     * 选择一个transport和server做互连
     * @return
     */
    TransportClient select();

    /**
     * 释放连接
     * @param client
     */
    void release(TransportClient client);

    void close();
}
