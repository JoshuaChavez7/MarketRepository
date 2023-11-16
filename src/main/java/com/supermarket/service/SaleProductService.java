package com.supermarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermarket.entity.Product;
import com.supermarket.entity.Sale;
import com.supermarket.entity.SaleProduct;
import com.supermarket.repository.ProductRepository;
import com.supermarket.repository.SaleProductRepository;

@Service
public class SaleProductService {
	
	@Autowired
	SaleProductRepository saleProductRepository;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	SaleService saleService;
	
		public void  create (int productCode, int saleId) {
			
			Product product = productService.getOne(productCode);
			Sale sale = saleService.getOne(saleId);
			
			SaleProduct saleProduct = new SaleProduct();
			saleProduct.setProduct(product);
			saleProduct.setSale(sale);
			saleProductRepository.save(saleProduct);
			
		}
	
	
	
	

}
