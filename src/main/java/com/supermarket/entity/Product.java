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

@Table(name = "product")
@Entity
public class Product {
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public MeasureUnit getMeasureUnit() {
		return measureUnit;
	}

	public void setMeasureUnit(MeasureUnit measureUnit) {
		this.measureUnit = measureUnit;
	}

	public Set<SaleProduct> getSaleProducts() {
		return saleProducts;
	}

	public void setSaleProducts(Set<SaleProduct> saleProducts) {
		this.saleProducts = saleProducts;
	}

	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int code;
	
	@Column
	private String name;
	
	@Column
	private double price;
	
	
	@ManyToOne
	@JoinColumn(name = "measure_unit_id")
	private MeasureUnit measureUnit;
	
	@OneToMany(mappedBy = "product")
	private Set<SaleProduct> saleProducts;

}
