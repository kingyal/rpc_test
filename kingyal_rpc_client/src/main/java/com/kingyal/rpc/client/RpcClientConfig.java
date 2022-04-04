package com.kingyal.rpc.client;

import com.kingyal.rpc.client.codec.Decoder;
import com.kingyal.rpc.client.codec.Encoder;
import com.kingyal.rpc.client.codec.JSONDecoder;
import com.kingyal.rpc.client.codec.JSONEncoder;
import com.kingyal.rpc.client.transport.HTTPTransportClient;
import com.kingyal.rpc.client.transport.TransportClient;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class RpcClientConfig {
    private Class<? extends TransportClient> transportClass =
            HTTPTransportClient.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private Class<? extends TransportSelector> selectorClass =
            RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(new Peer("127.0.0.1", 3000));
}
