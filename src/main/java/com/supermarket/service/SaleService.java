package com.supermarket.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermarket.entity.Cashier;
import com.supermarket.entity.Client;
import com.supermarket.entity.Sale;
import com.supermarket.repository.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	SaleRepository saleRepository;
	
	@Autowired
	ClientService clientService;
	
	@Autowired
	CashierService cashierService;
	
	/**	C */
	public Sale create(double total, int cashierCode, String clientNit) {
		
		Client client = clientService.getOne(clientNit);
		
		Cashier cashier = cashierService.getOne(cashierCode);
		
		Sale sale = new Sale();
		sale.setTotal(total);
		sale.setCashier(cashier);
		sale.setClient(client);
		return saleRepository.save(sale);	
	}
	
	/**	R */
	public List<Sale> getAll(){
		return saleRepository.findAll();
	}
	
	/**	U */
	public void update(Sale sale, int code){
		
		sale.setSaleId(code);
		saleRepository.save(sale);
		
	}
	
	/**	D */
	public void delete(int code) {
		saleRepository.deleteById(code);
	}
	
	
	public Sale getOne(int code) { 
		Optional<Sale> searchedSale = saleRepository.findById(code);
		
		if(searchedSale.isPresent()) {
			return searchedSale.get();
		}else {
			throw new RuntimeException("El cajero no existe!");
		}
		
	}
	
	

}
