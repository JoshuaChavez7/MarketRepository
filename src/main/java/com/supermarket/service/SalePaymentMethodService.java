package com.supermarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermarket.entity.PaymentMethod;
import com.supermarket.entity.Sale;
import com.supermarket.entity.SalePaymentMethod;
import com.supermarket.repository.SalePaymentMethodRepository;

@Service
public class SalePaymentMethodService {
	
	@Autowired
	SalePaymentMethodRepository salePaymentMethodRepository;
	
	@Autowired
	SaleService saleService;
	
	@Autowired
	PaymentMethodService paymentMethodService;
	
	
	public void create(int saleId, int paymentMethodId) {
		
		Sale sale = saleService.getOne(saleId);
		
		PaymentMethod paymentMethod = paymentMethodService.getOne(paymentMethodId);
		
		SalePaymentMethod salePaymentMethod = new SalePaymentMethod();
		salePaymentMethod.setPaymentMethod(paymentMethod);
		salePaymentMethod.setSale(sale);
		salePaymentMethodRepository.save(salePaymentMethod);
		
	}
}
