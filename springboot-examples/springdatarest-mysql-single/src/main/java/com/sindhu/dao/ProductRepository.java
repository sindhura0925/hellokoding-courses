package com.sindhu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sindhu.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
 
}