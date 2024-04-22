package com.bkboiz.shopappbackend.service.impl;

import com.bkboiz.shopappbackend.dto.OrderDetailDTO;
import com.bkboiz.shopappbackend.repository.OrderDetailRepository;
import com.bkboiz.shopappbackend.service.IOrderDetailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

import java.util.List;

@Log4j
@RequiredArgsConstructor
public class OrderDetailService implements IOrderDetailService {

    private final OrderDetailRepository detailRepo;
    @Override
    public List<OrderDetailDTO> findByOrderId(Long orderId) {
        return null;
    }
}
