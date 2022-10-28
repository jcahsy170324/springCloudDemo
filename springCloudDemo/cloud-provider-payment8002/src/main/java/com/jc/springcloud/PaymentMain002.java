package com.jc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName PaymentMain002
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/27 15:35
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain002.class,args);
    }
}
