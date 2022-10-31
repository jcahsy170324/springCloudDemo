package com.jc.order.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MySelfRule
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/31 13:11
 * @Version 1.0
 **/
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
