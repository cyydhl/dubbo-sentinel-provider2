package com.itcast.sentinel;

import com.itcast.sentinel.SentinelService;
import org.apache.dubbo.config.annotation.Service;

import java.time.LocalDateTime;

/**
 * Created by Administrator on 2019/8/11.
 */
@Service
public class SentinelServiceImpl implements SentinelService {
    @Override
    public String sayHello(String name) {
        System.out.println("begin execute sayHello:"+name);
        return "Hello World:"+name+"->timer:"+ LocalDateTime.now();
    }
}
