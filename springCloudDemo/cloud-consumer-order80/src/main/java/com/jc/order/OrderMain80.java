package com.jc.order;

import com.jc.order.myRule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ClassName OrderMain80
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/26 15:05
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-ORDER-SERVICE",configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
