package com.supermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supermarket.entity.SaleProduct;

public interface SaleProductRepository extends JpaRepository<SaleProduct, Integer> {

}
