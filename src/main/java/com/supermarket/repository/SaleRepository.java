package com.supermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supermarket.entity.Sale;

public interface SaleRepository extends JpaRepository<Sale, Integer>{

}
