package com.temri.ecommerce.payment;

import com.temri.ecommerce.customer.CustomerResponse;
import com.temri.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
