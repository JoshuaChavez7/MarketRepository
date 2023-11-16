package com.supermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supermarket.entity.SalePaymentMethod;

public interface SalePaymentMethodRepository extends JpaRepository<SalePaymentMethod, Integer>{

}
