package com.supermarket.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermarket.entity.Cashier;
import com.supermarket.repository.CashierRepository;

@Service
public class CashierService {
	
	@Autowired
	CashierRepository cashierRepository;
	
	/**	C */
	public void create(Cashier cashier) {
		cashierRepository.save(cashier);
		
	}
	
	/**	R */
	public List<Cashier> getAll(){
		return cashierRepository.findAll();
	}
	
	/**	U */
	public void update(Cashier cashier, int code){
		
		cashier.setCode(code);
		cashierRepository.save(cashier);
		
	}
	
	/**	D */
	public void delete(int code) {
		cashierRepository.deleteById(code);
	}
	
	
	public Cashier getOne(int code) { 
		Optional<Cashier> searchedCashier = cashierRepository.findById(code);
		
		if(searchedCashier.isPresent()) {
			return searchedCashier.get();
		}else {
			throw new RuntimeException("El cajero no existe!");
		}
		
	}
	
	

}
