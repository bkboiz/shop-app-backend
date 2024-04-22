package com.bkboiz.shopappbackend.service.impl;

import com.bkboiz.shopappbackend.entity.Product;
import com.bkboiz.shopappbackend.repository.ProductRepository;
import com.bkboiz.shopappbackend.service.IProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Log4j
@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

    private final ProductRepository productRepo;

    @Override
    public Product create(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        Optional<Product> byId = productRepo.findById(id);
        return byId.orElse(null);
    }
}
