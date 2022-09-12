package com.github.dmitrkuznetsov.backend.service;

import com.github.dmitrkuznetsov.backend.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PaymentHandlerServiceToLog implements PaymentHandlerService {
    @Override
    public void accept(Payment payment) {
        log.info("payment:{}", payment);
    }
}
