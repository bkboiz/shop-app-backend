package com.bkboiz.shopappbackend.controller;

import com.bkboiz.shopappbackend.dto.CategoryDTO;
import com.bkboiz.shopappbackend.entity.Product;
import com.bkboiz.shopappbackend.service.CategoryService;
import com.bkboiz.shopappbackend.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    public ResponseEntity createCategory(@Valid @RequestBody CategoryDTO categoryDTO,
                                         BindingResult result) {
        if (result.hasErrors()) {
            List<String> errMsgs = result.getFieldErrors()
                    .stream()
                    .map(FieldError::getDefaultMessage)
                    .toList();
            return ResponseEntity.badRequest().body(errMsgs);
        }
        return ResponseEntity.ok(categoryService.create(categoryDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity getCategoryById(@PathVariable Long id) {
        return ResponseEntity.ok(categoryService.getCategoryById(id));
    }
}
