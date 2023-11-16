package com.supermarket.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermarket.entity.Product;
import com.supermarket.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	/**	C */
	public void create(Product product) {
		productRepository.save(product);
		
	}
	
	/**	R */
	public List<Product> getAll(){
		return productRepository.findAll();
	}
	
	/**	U */
	public void update(Product product, int code){
		
		product.setCode(code);
		productRepository.save(product);
		
	}
	
	/**	D */
	public void delete(int code) {
		productRepository.deleteById(code);
	}
	
	
	public Product getOne(int code) { 
		Optional<Product> searchedProduct = productRepository.findById(code);
		
		if(searchedProduct.isPresent()) {
			return searchedProduct.get();
		}else {
			throw new RuntimeException("El cajero no existe!");
		}
		
	}
	
	

}
