package com.bkboiz.shopappbackend.service;

import com.bkboiz.shopappbackend.entity.Product;
import com.bkboiz.shopappbackend.service.impl.ProductServiceImpl;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    Product create(Product product);

    Product getProductById(Long id);
}
