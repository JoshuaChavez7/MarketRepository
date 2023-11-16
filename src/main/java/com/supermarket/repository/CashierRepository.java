package com.supermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supermarket.entity.Cashier;


public interface CashierRepository extends JpaRepository<Cashier, Integer>{
		
}
