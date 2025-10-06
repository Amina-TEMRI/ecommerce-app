package com.temri.ecommerce.kafka;

import com.temri.ecommerce.customer.CustomerResponse;
import com.temri.ecommerce.order.PaymentMethod;
import com.temri.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
