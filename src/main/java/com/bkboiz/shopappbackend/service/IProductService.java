package com.bkboiz.shopappbackend.service;

import com.bkboiz.shopappbackend.entity.Product;
import org.springframework.stereotype.Service;

@Service
public interface IProductService {
    Product create(Product product);

    Product getProductById(Long id);
}
