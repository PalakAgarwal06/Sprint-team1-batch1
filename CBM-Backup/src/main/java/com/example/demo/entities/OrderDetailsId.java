package com.example.demo.entities;


import java.io.Serializable;

public class OrderDetailsId implements Serializable {


	private static final long serialVersionUID = 1L;
	private Product product;
	private Order orders;

	public OrderDetailsId() {
		super();
	}

	
	public OrderDetailsId(Product product, Order orders) {
		super();
		this.product = product;
		this.orders = orders;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
	public Order getOrders() {
		return orders;
	}

	public void setOrders(Order orders) {
		this.orders = orders;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

