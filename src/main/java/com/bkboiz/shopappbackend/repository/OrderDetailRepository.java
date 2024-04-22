package com.bkboiz.shopappbackend.repository;

import com.bkboiz.shopappbackend.entity.OrderDetail;
import com.bkboiz.shopappbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}
