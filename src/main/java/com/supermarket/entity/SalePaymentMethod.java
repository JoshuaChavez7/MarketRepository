package com.supermarket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "sale_payment_method")
@Entity
public class SalePaymentMethod {

	@Column(name = "sale_payment_method_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

    @ManyToOne
    @JoinColumn(name = "payment_method_id")
	private PaymentMethod paymentMethod;
	

	@ManyToOne
    @JoinColumn(name = "sale_id")
	private Sale sale;
	
	
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}
}
