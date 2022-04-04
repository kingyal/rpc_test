package com.kingyal.rpc.client.transport;

/**
 * 1. 启动，监听
 * 2. 接受请求并处理
 * 3. 关闭监听
 */
public interface TransportServer {
    void init(int port, RequestHandler handler);

    void start();

    void stop();
}
