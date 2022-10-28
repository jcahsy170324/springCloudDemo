package com.jc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName PaymentMain001
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/26 10:26
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain001.class, args);
    }
}
