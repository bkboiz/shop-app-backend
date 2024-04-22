package com.bkboiz.shopappbackend.service.impl;

import com.bkboiz.shopappbackend.dto.OrderDTO;
import com.bkboiz.shopappbackend.service.IOrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {
    @Override
    public Object order(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public List<OrderDTO> findByUserId(Long userId) {
        return null;
    }
}
