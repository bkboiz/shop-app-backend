package com.bkboiz.shopappbackend.service;

import com.bkboiz.shopappbackend.dto.OrderDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IOrderService {
    Object order(OrderDTO orderDTO);

    List<OrderDTO> findByUserId(Long userId);
}
