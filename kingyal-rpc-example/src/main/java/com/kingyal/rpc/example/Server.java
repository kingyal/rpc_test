package com.kingyal.rpc.example;

import com.kingyal.rpc.client.RpcClient;
import com.kingyal.rpc.client.server.RpcServer;
import com.kingyal.rpc.client.server.RpcServerConfig;

public class Server {
    public static void main(String[] args) {
        RpcServer server = new RpcServer(new RpcServerConfig());
        server.register(CalcService.class, new CalcServiceImpl());
        server.start();
    }
}
