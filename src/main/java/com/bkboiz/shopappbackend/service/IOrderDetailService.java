package com.bkboiz.shopappbackend.service;

import com.bkboiz.shopappbackend.dto.OrderDetailDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IOrderDetailService {
    List<OrderDetailDTO> findByOrderId(Long orderId);
}
