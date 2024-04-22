package com.bkboiz.shopappbackend.service;

import com.bkboiz.shopappbackend.dto.CategoryDTO;
import com.bkboiz.shopappbackend.entity.Category;
import org.springframework.stereotype.Service;

@Service
public interface ICategoryService {
    Category create(CategoryDTO categoryDTO);

    Category getCategoryById(Long id);
}
