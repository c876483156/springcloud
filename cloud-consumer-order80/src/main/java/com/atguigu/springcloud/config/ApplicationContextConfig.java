package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationContextConfig
 * @Description RestTemplate配置类
 * @Author 陈益方
 * @Date 2020/12/1
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced // 开启默认的负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
