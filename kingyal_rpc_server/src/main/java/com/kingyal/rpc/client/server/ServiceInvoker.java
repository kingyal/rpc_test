package com.kingyal.rpc.client.server;

import com.kingyal.rpc.client.Request;
import com.kingyal.rpc.common.utils.ReflectionUtils;

public class ServiceInvoker {
    public Object invoke(ServiceInstance serviceInstance, Request request) {
        return ReflectionUtils.invoke(
                serviceInstance.getTarget(),
                serviceInstance.getMethod(),
                request.getParameters());
    }
}
