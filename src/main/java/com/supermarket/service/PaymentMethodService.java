package com.supermarket.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermarket.entity.PaymentMethod;
import com.supermarket.repository.PaymentMethodRepository;

@Service
public class PaymentMethodService {
	
	@Autowired
	PaymentMethodRepository saymentMethodRepository;
	
	/**	C */
	public void create(PaymentMethod saymentMethod) {
		saymentMethodRepository.save(saymentMethod);
		
	}
	
	/**	R */
	public List<PaymentMethod> getAll(){
		return saymentMethodRepository.findAll();
	}
	
	/**	U */
	public void update(PaymentMethod saymentMethod, int code){
		
		saymentMethod.setId(code);
		saymentMethodRepository.save(saymentMethod);
		
	}
	
	/**	D */
	public void delete(int code) {
		saymentMethodRepository.deleteById(code);
	}
	
	
	public PaymentMethod getOne(int code) { 
		Optional<PaymentMethod> searchedPaymentMethod = saymentMethodRepository.findById(code);
		
		if(searchedPaymentMethod.isPresent()) {
			return searchedPaymentMethod.get();
		}else {
			throw new RuntimeException("El cajero no existe!");
		}
		
	}
	
	

}
