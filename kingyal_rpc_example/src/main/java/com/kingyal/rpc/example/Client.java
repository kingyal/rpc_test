package com.kingyal.rpc.example;

import com.kingyal.rpc.client.RpcClient;

public class Client {
    public static void main(String[] args) {
        RpcClient client = new RpcClient();
        CalcService service = client.getProxy(CalcService.class);
        int r1 = service.add(1, 2);
        int r2 = service.minus(10, 4);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
    }
}
