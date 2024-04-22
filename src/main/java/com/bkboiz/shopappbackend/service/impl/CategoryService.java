package com.bkboiz.shopappbackend.service.impl;

import com.bkboiz.shopappbackend.dto.CategoryDTO;
import com.bkboiz.shopappbackend.entity.Category;
import com.bkboiz.shopappbackend.repository.CategoryRepository;
import com.bkboiz.shopappbackend.service.ICategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

@Log4j
@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService {

    private final CategoryRepository categoryRepo;

    @Override
    public Category create(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public Category getCategoryById(Long id) {
        return null;
    }
}
