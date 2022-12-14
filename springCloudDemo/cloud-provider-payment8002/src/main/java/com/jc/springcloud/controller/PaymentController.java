package com.jc.springcloud.controller;

import com.jc.common.entity.Payment;
import com.jc.springcloud.common.CommonResult;
import com.jc.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/27 15:36
 * @Version 1.0
 **/
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private Integer port;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果:"+result);

        if (result > 0){
            return new CommonResult(200,"插入数据库成功,serverPort:"+port,result);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null){
            return new CommonResult(200,"查询成功,serverPort:"+port,payment);
        }else{
            return new CommonResult<>(444,"没有对应记录，查询id:"+id,null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return String.valueOf(port);//返回服务接口
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        return String.valueOf(port);
    }
}
