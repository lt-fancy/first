/**   
* @Title: HelloServiceTest.java
* @Package cn.com.dhcc.credit.proxy
* @Description: TODO(用一句话描述该文件做什么)
* @author: fff   
* @date 2017年3月20日 下午3:05:12
* @version V1.0   
*/


package com.sawallianc.rpc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sawallianc.rpc.proxy.RpcProxy;
import com.sawallianc.rpc.service.HelloService;

/**
 * @ClassName: HelloServiceTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author: fff 
 * @date 2017年3月20日 下午3:05:12
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class HelloServiceTest {
 
    @Autowired
    private RpcProxy rpcProxy;
 
    @Test
    public void helloTest() {
        HelloService helloService = rpcProxy.create(HelloService.class);
        String result = helloService.hello("World");
        System.out.println(result);
    }
}	
