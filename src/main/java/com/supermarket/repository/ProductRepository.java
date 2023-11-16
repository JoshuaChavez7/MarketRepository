package com.supermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supermarket.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
