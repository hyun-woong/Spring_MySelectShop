package com.sparta.spring2_week01.repository;

import com.sparta.spring2_week01.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> { }