package com.supermarket.entity;


import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Table(name = "payment_method")
@Entity
public class PaymentMethod {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payment_method_id")
	private int id;
	
	@Column
	private String name;
	
	
	 public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Set<SalePaymentMethod> getSalePaymentMethod() {
		return salePaymentMethod;
	}


	public void setSalePaymentMethod(Set<SalePaymentMethod> salePaymentMethod) {
		this.salePaymentMethod = salePaymentMethod;
	}


	@OneToMany(mappedBy = "paymentMethod")
	 Set<SalePaymentMethod> salePaymentMethod;


}
