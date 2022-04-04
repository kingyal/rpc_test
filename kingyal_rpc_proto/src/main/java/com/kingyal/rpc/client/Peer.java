package com.kingyal.rpc.client;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 网络传输的端点
 */

@Data
@AllArgsConstructor
public class  Peer {
    private String host;
    private int port;

}
