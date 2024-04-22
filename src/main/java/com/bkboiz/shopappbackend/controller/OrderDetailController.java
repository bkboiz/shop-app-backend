package com.bkboiz.shopappbackend.controller;

import com.bkboiz.shopappbackend.service.IOrderDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/order-detail")
@RequiredArgsConstructor
public class OrderDetailController {

    private final IOrderDetailService orderDetailService;

    @GetMapping("order/{orderId}")
    public ResponseEntity getOrderDetailByOrderId(@PathVariable Long orderId) {
        return ResponseEntity.ok(orderDetailService.findByOrderId(orderId));
    }
}
