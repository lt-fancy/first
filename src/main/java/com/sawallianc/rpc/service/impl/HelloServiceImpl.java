package com.sawallianc.rpc.service.impl;

import com.sawallianc.rpc.annotation.RpcService;
import com.sawallianc.rpc.service.HelloService;

@RpcService(HelloService.class) // 指定远程接口
public class HelloServiceImpl implements HelloService {
 
    @Override
    public String hello(String name) {
        return "=================================Hello! " + name;
    }
}
