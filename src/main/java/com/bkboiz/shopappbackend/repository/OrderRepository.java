package com.bkboiz.shopappbackend.repository;

import com.bkboiz.shopappbackend.entity.Order;
import com.bkboiz.shopappbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
