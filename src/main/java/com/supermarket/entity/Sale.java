package com.supermarket.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "sale")
@Entity
public class Sale {
	
	@Id
	@Column(name = "sale_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int saleId;
	
	@Column(name = "total")
	private double total;
	

	@ManyToOne
	@JoinColumn(name = "nit")
	private Client client;

	
	@ManyToOne
	@JoinColumn(name = "cashier_code")
	private Cashier cashier;
	
	
	@OneToMany(mappedBy = "sale")
	private Set<SalePaymentMethod> salePaymentMethods;
	
	@OneToMany(mappedBy = "sale")
	private Set<SaleProduct> saleProducts;
	
	
	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Cashier getCashier() {
		return cashier;
	}

	public void setCashier(Cashier cashier) {
		this.cashier = cashier;
	}

	public Set<SalePaymentMethod> getSalePaymentMethods() {
		return salePaymentMethods;
	}

	public void setSalePaymentMethods(Set<SalePaymentMethod> salePaymentMethods) {
		this.salePaymentMethods = salePaymentMethods;
	}

	public Set<SaleProduct> getSaleProducts() {
		return saleProducts;
	}

	public void setSaleProducts(Set<SaleProduct> saleProducts) {
		this.saleProducts = saleProducts;
	}

	
}
