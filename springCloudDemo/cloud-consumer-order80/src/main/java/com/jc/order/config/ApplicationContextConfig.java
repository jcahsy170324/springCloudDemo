package com.jc.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationContextConfig
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/26 15:14
 * @Version 1.0
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced//使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
