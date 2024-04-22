package com.bkboiz.shopappbackend.repository;

import com.bkboiz.shopappbackend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
