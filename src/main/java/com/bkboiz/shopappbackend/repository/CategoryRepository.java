package com.bkboiz.shopappbackend.repository;

import com.bkboiz.shopappbackend.entity.Category;
import com.bkboiz.shopappbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
