package com.jc.springcloud.service.impl;

import com.jc.common.entity.Payment;
import com.jc.springcloud.dao.PaymentDao;
import com.jc.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Description TODO
 * @Author jincheng
 * @Date 2022/10/27 15:38
 * @Version 1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
