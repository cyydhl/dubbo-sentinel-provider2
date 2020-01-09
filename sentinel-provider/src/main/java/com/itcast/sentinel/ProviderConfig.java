package com.itcast.sentinel;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2019/8/11.
 */
@Configuration
@DubboComponentScan("com.itcast.sentinel")
public class ProviderConfig {
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig config=new ApplicationConfig();
        config.setName("sentinel-provider");
        config.setOwner("Cyy");
        return config;
    }
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig=new RegistryConfig();
        registryConfig.setAddress("zookeeper://192.168.0.111:2181");
        registryConfig.setCheck(false);
        return registryConfig;
    }
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig=new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        return protocolConfig;
    }
}

