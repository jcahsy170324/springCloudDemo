package com.jc.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FeignConfig
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/31 19:24
 * @Version 1.0
 **/
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
