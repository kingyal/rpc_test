package com.kingyal.rpc.client.server;

import com.kingyal.rpc.client.codec.Decoder;
import com.kingyal.rpc.client.codec.Encoder;
import com.kingyal.rpc.client.codec.JSONDecoder;
import com.kingyal.rpc.client.codec.JSONEncoder;
import com.kingyal.rpc.client.transport.HTTPTransportServer;
import com.kingyal.rpc.client.transport.TransportServer;
import lombok.Data;

/**
 * server配置
 */
@Data
public class RpcServerConfig {
    private Class<? extends TransportServer> transportClass = HTTPTransportServer.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private int port = 3000;
 }
